package com.tsing.chapter15.reflect;

class X{
	
}

public class GtClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		
		X x = new X();
		
		try {
			c1 = Class.forName(x.getClass().getName());
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		c2 = new X().getClass();
		c3 = X.class;
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
	}

}
