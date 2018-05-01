package lianxi;

public class Demo {
	public static void main(String[] args) {
		//String str2 = new String("aaa");
		String str1 = "aaa",str2; 
		 str2="aaa";
		 //已经存在aaa了，所有只在堆内存中创建，再指向字符串）
		System.out.println("str1 str2"+str1==str2);
		
		String str4 = "aaabbb";  
		  
		String str5 = "aaa" + "bbb"; 
		String str6 = str1+"bbb";
		//String str7 = str2+"ddd"+"eee";
	System.out.println(str4==str6);
	}

}
