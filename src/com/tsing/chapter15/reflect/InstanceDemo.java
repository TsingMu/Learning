package com.tsing.chapter15.reflect;



public class InstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c = null;
		try {
			c = Class.forName("com.tsing.chapter15.reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) c.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		per.setAge(27);
		per.setName("Tsing");
		
		System.out.println(per);
 
	}

}
