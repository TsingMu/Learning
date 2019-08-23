package com.tsing.chapter15.reflect;

import java.lang.reflect.Method;

public class InvokeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c = null;
		try {
			c = Class.forName("com.tsing.chapter15.reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			Method met = c.getMethod("sayChina");
			met.invoke(c.newInstance());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Method met = c.getMethod("sayHello", String.class,int.class);
			String rcv = null;
			rcv = (String) met.invoke(c.newInstance(), "Tsing",27);
			System.out.println(rcv);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
