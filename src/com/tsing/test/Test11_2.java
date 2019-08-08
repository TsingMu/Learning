package com.tsing.test;

import java.awt.print.Printable;
import java.util.Random;

public class Test11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] data = new int[5];
		for(int i =0 ; i<data.length; i++){
			int t = r.nextInt(20);
			data[i] = t;
		}
		//data.print();
		print(data);

	}
	
	static void print(int[] d){
		for(int i=0; i<d.length; i++){
			System.out.println(d[i]);
		}
	}

}
