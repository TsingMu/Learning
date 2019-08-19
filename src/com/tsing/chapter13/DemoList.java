package com.tsing.chapter13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stubL
		List<String> allList = null;
		Collection<String> allCollection = null;
		allList = new ArrayList<String>();
		allCollection = new ArrayList<String>();
		allList.add("Hello");
		allList.add(1,"World");
		System.out.println(allList);
		allCollection.add("fuxk");
		allCollection.add("you");
		allList.addAll(allCollection);
		allList.addAll(1, allCollection);
		System.out.println(allList);
		
		String[] str = allList.toArray(new String[]{});
		System.out.println(str);
		List<String> allSub = allList.subList(0, 6);
		System.out.println(allSub);
		for (String string : allSub) {
			System.out.println(string);
		}

	}

}
