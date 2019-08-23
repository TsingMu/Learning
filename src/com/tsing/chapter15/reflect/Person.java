package com.tsing.chapter15.reflect;

interface China{
	public static final String NATION = "China";
	public static final String AUTHOR = "Tsing";
	public void sayChina();
	public String sayHello(String name, int age);
}

class Person implements China{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name){
		this.setName(name);
	}
	
	public Person(String name, int age){
		this(name);
		this.setAge(age);		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "name: "+ this.getName() + ",age: " + this.getAge();
	}

	@Override
	public void sayChina() {
		// TODO Auto-generated method stub
		System.out.println("author: " + AUTHOR + ",nation: " +NATION);
	}

	@Override
	public String sayHello(String name, int age) {
		// TODO Auto-generated method stub
		return  "hello ,"+name+" fucked you " + age  +" times";
	}
}
