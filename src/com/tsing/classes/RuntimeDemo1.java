package com.tsing.classes;

public class RuntimeDemo1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		System.out.println("Max Memory: " + run.maxMemory());
		System.out.println("Free Memory: " + run.freeMemory());
		
		String str = "Hello" + "world" + "!!!";
		str += "fucklkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
		System.out.println(str);
		
		for(int i = 0 ; i< 50000 ; i++){
			str += i ;
		}
		
		System.out.println("Free Memory after operation: " + run.freeMemory());
		run.gc();
		System.out.println("Free Memory after clear: " + run.freeMemory());
		
		

	}

}
