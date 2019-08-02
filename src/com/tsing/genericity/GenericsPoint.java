package com.tsing.genericity;

public class GenericsPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Point<Integer> p = new Point<>();
		p.set(10, 8);
		int x = p.getX();
		int y = p.getY();
		System.out.println("X is " + x + " Y is " + y);

	}

}
