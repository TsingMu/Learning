package com.tsing.classes;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for(int i=0 ;i< 300000000; i++){
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time cost: " + (endTime - startTime) + " ms");
		
		System.getProperties().list(System.out);
		

	}

}
