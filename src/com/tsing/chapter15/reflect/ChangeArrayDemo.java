package com.tsing.chapter15.reflect;

import java.lang.reflect.Array;

public class ChangeArrayDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int[] temp = {1,2,4};
		int[] newTemp = (int[]) arrayInc(temp, 6);
		print(newTemp);
		System.out.println("\n=======================");
		String[] t = {"tsing","fcuk","u"};
		String[] nt = (String[]) arrayInc(t, 8);
		print(nt);

	}

	private static Object arrayInc(Object obj, int len) {
		// TODO Auto-generated method stub
		Class<?> c = obj.getClass();
		Class<?> arr = c.getComponentType();
		Object newO = Array.newInstance(arr, len);
		int co = Array.getLength(obj);
		System.arraycopy(obj, 0, newO, 0, co);
		return newO;
	}

	private static void print(Object obj) {
		// TODO Auto-generated method stub
		Class<?> c = obj.getClass();
		if(!c.isArray()){
			return;
		}
		Class<?> arr = c.getComponentType();
		System.out.println(arr.getName() + "length of array"
				+ Array.getLength(obj));
		for(int i=0; i<Array.getLength(obj); i++){
			System.out.print(Array.get(obj, i) + "\\");
		}
	}

}
