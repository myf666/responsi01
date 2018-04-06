package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class TestJdbc {
	public static void main(String[] args) {
		//连接数据库
		Connection conn=null;
		//定义预处理
		PreparedStatement ps=null;
		//定义查询结果
		ResultSet rs=null;
		String name;
		//注册驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ceshi", "root", "root");
			//定义sql语句
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
