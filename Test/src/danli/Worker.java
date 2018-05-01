package danli;

public class Worker { 
	//定义一个私有的构造方法，外界不能new'
	private Worker () {};
	//定义一个共有的静态的方法,外界可访问课，通过类名.方法名即可
	
	public static Worker Boss() {
		return bo;
	}
	//定义一个私有的静态方法newboss，只能本类访问，类加载时只会执行一次
private static Worker bo=new Worker();
}
