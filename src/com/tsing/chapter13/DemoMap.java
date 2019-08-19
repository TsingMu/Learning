package com.tsing.chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = null;
		map = new HashMap<String, String>();
		map.put("fuck", "you");
		map.put("cao", "nima");
		map.put("s", "b");
		
		String you = map.get("fuck");
		System.out.println(you);
		
		if(map.containsKey("fuck")){
			System.out.println("fuck you");
		}
		
		if(map.containsValue("nima")){
			System.out.println("caonima");
		}
		
		Set<String> key = map.keySet();
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		Collection<String> val = map.values();
		Iterator<String> iter1 = val.iterator();
		while(iter1.hasNext()){
			String str1 = iter1.next();
			System.out.print(str1 + " ");
		}

	}

}
