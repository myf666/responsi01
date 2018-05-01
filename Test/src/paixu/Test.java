package paixu;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//List<Integer> list=new ArrayList<Integer>();
		int [] a={2,6,5,1,2,1,4,3,5,5,8,3};
		System.out.println(a.length);
		//冒泡排序
		for(int b=0;b<a.length;b++) {
			for(int c=0;c<a.length-1;c++) {
				if (a[c]<a[c+1]) {
					int d=a[c+1];
					a[c+1]=a[c];
					a[c]=d;
				}
			}
		}
		System.out.println("排序后的数组:");
		for(int e=0;e<a.length;e++) {
			System.out.print(a[e]+" ");
		}
		
	}

}
