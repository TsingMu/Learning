package com.tsing.chapter14;



public class colorEnum {
	public enum Color{
		RED,GREEN,BLUE;
	}
	
	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println(c);
		for (Color d : Color.values()) {
			System.out.println(d.ordinal() + " ---> " + d.name() );
			
		}
	}

}
