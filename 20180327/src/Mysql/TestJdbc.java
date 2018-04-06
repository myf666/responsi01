package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class TestJdbc {
	public static void main(String[] args) {
		//�������ݿ�
		Connection conn=null;
		//����Ԥ����
		PreparedStatement ps=null;
		//�����ѯ���
		ResultSet rs=null;
		String name;
		//ע������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ceshi", "root", "root");
			//����sql���
			String sql="select name from user";
			ps= (PreparedStatement) conn.prepareStatement(sql);
			rs=ps.executeQuery(sql);
			if(rs.next()) {
				System.out.println(sql
						);
			}
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(ps !=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
