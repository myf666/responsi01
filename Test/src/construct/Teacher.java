package construct;

public class Teacher {
	int a=2;
	public Teacher(String school,int age) {
		String name="zhangsi";
		System.out.println("����:"+name+"����"+age+"��"+"��"+school);
	}
	public Teacher(int a) {
		//this.a=a;
		a=this.a;
		System.out.println(a);
	}

}
