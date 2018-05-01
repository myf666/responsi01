package lianxi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1", "张三");
		map.put("2", "李四");
		map.put("3", "王六");
		map.put("4", "王五");
		System.out.println(map.keySet());
		System.out.println(map.values());
		Set keyset=map.keySet();
		Iterator it=keyset.iterator();
		while(it.hasNext()) {
			Object a= it.next();
			Object value=map.get(a);
			System.out.println(a+":"+value);
		}
		
	}

}
