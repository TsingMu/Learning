package com.tsing.learning;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PersonWithEnc implements Externalizable{
	private String name;
	private int age;
	public PersonWithEnc(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age =age;
	}
	public PersonWithEnc(){}
	
	public String toString(){
		return "name:" + this.name + ";age:" + this.age;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonWithEnc per = new PersonWithEnc("Tsing",10);
		
		per.setAge(18);
		per.setName("Tsing");
		per.tell();
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		this.name = (String)in.readObject();
		this.age = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(this.name);
		out.writeInt(this.age);
		
	}

}
