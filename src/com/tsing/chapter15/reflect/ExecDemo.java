package com.tsing.chapter15.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ExecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c = null;
		try {
			c = Class.forName("com.tsing.chapter15.reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Class<?>[] c1 = c.getInterfaces();
		for (Class<?> class1 : c1) {
			System.out.println(class1.getName());
		}
		
		Class<?> c2 = c.getSuperclass();
		System.out.println(c2.getName());
		
		Constructor<?>[] con = c.getConstructors();
		for (Constructor<?> constructor : con) {
			//int mo = constructor.getModifiers();
			//System.out.print(Modifier.toString(mo) + " ");
			System.out.println(constructor + "{}");
		}
		System.out.println("=============================");
		
		Method[] m = c.getMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		System.out.println("====================================================");
		
		Field[] f = c.getDeclaredFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		System.out.println("=================");
		
		f = c.getFields();
		for (Field field : f) {
			System.out.println(field);
		}

	}

}
