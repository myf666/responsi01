package Decora;

public class BufferRead extends Read{
	//要想装饰FileRead,肯定要引用人家
	Read read;
	//定义一个带参read的构造方法,把FileRead传过来，再赋给
	//成员变量read
	public BufferRead(Read read) {
		this.read=read;
	}
	//书写和人家一样的方法才可以装饰
	public  void Mook() {
		
		System.out.println("buffer1");
		read.Mook();
		System.out.println("buffer2");
	}

}
