package com.tsing.test;

public class Test11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		Character a='a';
		for(int i=0 ; i<26;i++){
			sb.append(a);
			a=new Character((char)(a+1));
		}
		
		System.out.println("after add:" + sb);
		
		sb.reverse();
		System.out.println("after reverse:" + sb);

		sb.delete(0, 5);
		System.out.println("fuck ");
		
		
		System.out.println("after delete:" + sb);
		
	}

}
