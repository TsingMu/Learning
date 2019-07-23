package com.tsing.learning;

public class ConsDemo {

	public static void main(String[] args) {
		Person per = new Person("Tsing", 27);
		per.tell();
		
		Person per1 = new Person("Qing Q");
		per1.tell();
		System.out.println(per1.getName());
	}

}

class Person{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String n){
		this.setName(n);
	}
	
	public Person(String n, int a){
		this.setName(n);
		this.setAge(a);
	}
	
	public void tell(){
		System.out.println("ÐÕÃû£º" + this.getName() +" ÄêÁä£º" + this.getAge());
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	private int getAge(){
		return age;
	}
	
	public void setAge(int n){
		if(n>=0 && n<=150){
			age = n; 
		}
	}
}
