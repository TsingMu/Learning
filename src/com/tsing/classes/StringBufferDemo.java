package com.tsing.classes;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("‰∆ noob").append(" shit happens");
		System.out.println("sb is : " + sb );
		String str = sb.substring(0, 1);
		System.out.println("str is " + str);

	}

}
