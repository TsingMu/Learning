package com.tsing.chapter15.reflect;

import java.lang.reflect.Method;

public class InvokeSetGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c =null;
		Object obj = null;
		try {
			c = Class.forName("com.tsing.chapter15.reflect.Person");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			obj = c.newInstance();
		}catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setter(obj, "name", "Tsing", String.class);
		setter(obj, "age", 27, int.class);
		System.out.println("name: ");
		getter(obj, "name");

	}
	/***
	 * 
	 * @param obj 操作的对象
	 * @param att 操作的属性
	 * @param value 设置的值
	 * @param type 参数的类型
	 */
	public static void setter(Object obj, String att, Object value, Class<?> type){
		try {
			Method met = obj.getClass().getMethod("set"+initStr(att),type);
			met.invoke(obj, value);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void getter(Object obj , String att){
		try {
			Method met = obj.getClass().getMethod("get" + initStr(att));
			System.out.println(met.invoke(obj));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static String initStr(String old){
		String str = old.substring(0,1).toUpperCase() + old.substring(1);
		return str;
	}

}
