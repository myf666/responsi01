package lianxi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		Date da=new Date();
		SimpleDateFormat sdf=	new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str=sdf.format(da);
	System.out.println(str);
	String str1="1995-02-21 21:53:23";
	Date str2=null;
	try {
		str2=sdf.parse(str1);
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(str2);
	}
	

}
