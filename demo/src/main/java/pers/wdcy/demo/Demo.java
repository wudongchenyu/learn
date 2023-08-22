package pers.wdcy.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.entrySet().stream();
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			list.remove(string);
		}
		
//		for (String string : list) {
//			list.remove(string);
//		}
	}

}
