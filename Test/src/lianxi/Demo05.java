package lianxi;

public class Demo05 {
	public static void main(String[] args) {
		String str="ab";
		String str1="cd";
		String str2="abcd";
		String str3=str+str1;
		String str4=str+"cd";
		System.out.println(str3==str2);
		System.out.println(str4==str2);
		System.out.println(str4);
;	}

}
