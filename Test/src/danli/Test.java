package danli;

 class Test01 {
	//����һ��˽�о�̬����
	private static Test01 s;
	//����˽��һ�����췽��
	private Test01() {};
	//����һ�����еľ�̬�������������ʣ���ָ�Ӽ���һ��
	public static Test01 Conn() {
		if(s==null) {
			s=new Test01();
		}
		return s;
	}

}
 public class Test{
	public static void main(String[] args) {
		Test01 a=Test01.Conn();
		Test01 b=Test01.Conn();
		System.out.println(a==b);
	}
}
