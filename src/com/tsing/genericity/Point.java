package com.tsing.genericity;

public class Point <T> {
	private T x;
	private T y;
	
	public void set(T x, T y){
		this.x = x;
		this.y = y;
	}
	
	public T getX(){
		return this.x;
	}
	
	public T getY(){
		return this.y;
	}

}
