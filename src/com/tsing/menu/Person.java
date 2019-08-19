package com.tsing.menu;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "name:" + this.name +",age:" + this.age;
	}
	
	

}
