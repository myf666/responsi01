package jicheng;

import org.junit.Test;


public class Son extends Father {
	public static void main(String[] args) {
		Son son=new Son();
		
	}
	//定义一个无参的构造函数
	public Son() {
		
		this("掌死");
		System.out.println("子类无参构造函数");
		
	}
	public Son(String name) {
		super("胀死");
		System.out.println("子类带参构造函数"+name);
	}
	
}
