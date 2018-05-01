package lianxi;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("要输入几个数字的数组:");
		int len=sc.nextInt();
		int [] Scores = new int [len];
		for(int a=0;a<len;a++) {
			Scores[a]=sc.nextInt();
		}
		System.out.print("输入的数组是:");
		for(int a=0;a<len;a++) {
			System.out.print(Scores[a]+",");
		}

		
		for(int b=0;b<Scores.length;b++) {
			for(int c=0;c<Scores.length-b-1;c++) {
				if(Scores[c]>Scores[c+1]) {
					int mid=Scores[c];
					Scores[c]=Scores[c+1];
					Scores[c+1]=mid;
				}
			}
		}
		System.out.print("排序后的数组是:");
		for(int a=0;a<len;a++) {
			
			System.out.print(Scores[a]+",");
		}
	}

}
