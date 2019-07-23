package com.tsing.learning;

public class PersonWithEnc {
	private String name;
	private int age;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonWithEnc per = new PersonWithEnc();
		
		per.setAge(180);
		per.setName("Tsing");
		per.tell();
		
	}

}
