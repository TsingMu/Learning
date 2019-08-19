package com.tsing.chapter13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("1");
		set.add("B");
		set.add("D");
		set.add("E");
		System.out.println(set);
	}
}
