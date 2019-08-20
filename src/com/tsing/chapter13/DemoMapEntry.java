package com.tsing.chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=null;
		map = new HashMap<String, String>();
		map.put("fuck", "you");
		map.put("cao", "nima"); 
		map.put("s", "b");
		Set<Map.Entry<String, String>> set = null;
		set = map.entrySet();
		Iterator<Map.Entry<String, String>> iter = null;
		iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey() + "--->" + me.getValue());
		}
		
		for (Map.Entry<String, String> me : map.entrySet()){
			System.out.println(me.getKey() + "--->" + me.getValue());
		}
		
		
	}

}
