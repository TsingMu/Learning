package com.tsing.chapter13;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "name: " +this.name +" age: " +this.age;
	}

	@Override
	public int compareTo(Person per) {
		// TODO Auto-generated method stub
		if(this.age > per.age){
			return 1;
		}else if(this.age < per.age){
			return -1;
		}else{
			return this.name.compareTo(per.name);
		}
	}
	
}

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new TreeSet<Person>();
		set.add(new Person("Tsing",27));
		set.add(new Person("sb",35));
		set.add(new Person("sb", 30));
		set.add(new Person("Sy", 29));
		set.add(new Person("Eminem",27));
		System.out.println(set);

	}

}
