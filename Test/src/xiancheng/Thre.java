package xiancheng;

import java.util.Timer;

public class Thre {
	public static void main(String[] args) {
		Timer ti=new Timer();
		Thread t1=new Threadable();
		Runnable t2=new Threadab();
		Thread t3=new Thread(t2);
		t1.start();
		t3.start();
		for(int a=0;a<10;a++) {
			System.out.println("main�߳�");
			}
		
	}

}
//����һ���߳�
class Threadable extends Thread{
	public void run() {
		
			System.out.println("Threadavle�߳�");
			
	}
}
class Threadab implements Runnable{
	public void run() {
		System.out.println("Threadab�߳�");
	}
}