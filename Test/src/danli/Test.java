package danli;

 class Test01 {
	//定义一个私有静态对象
	private static Test01 s;
	//定义私有一个构造方法
	private Test01() {};
	//定义一个公有的静态方法，让外界访问，但指挥家在一次
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
