package jicheng;

import org.junit.Test;


public class Son extends Father {
	public static void main(String[] args) {
		Son son=new Son();
		
	}
	//����һ���޲εĹ��캯��
	public Son() {
		
		this("����");
		System.out.println("�����޲ι��캯��");
		
	}
	public Son(String name) {
		super("����");
		System.out.println("������ι��캯��"+name);
	}
	
}
