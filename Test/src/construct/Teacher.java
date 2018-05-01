package construct;

public class Teacher {
	int a=2;
	public Teacher(String school,int age) {
		String name="zhangsi";
		System.out.println("我是:"+name+"今年"+age+"岁"+"在"+school);
	}
	public Teacher(int a) {
		//this.a=a;
		a=this.a;
		System.out.println(a);
	}

}
