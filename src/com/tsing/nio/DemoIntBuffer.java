package com.tsing.nio;

import java.nio.IntBuffer;

public class DemoIntBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer buf = IntBuffer.allocate(10);
		System.out.println("before put:");
		System.out.println("position: " + buf.position() + " ,limit= " 
				+ buf.limit() + " ,capacity: " + buf.capacity());
		
		int[] temp = {1,5,3};
		buf.put(3);
		buf.put(temp);
		System.out.println("after put:");
		System.out.println("position: " + buf.position() + " ,limit= " 
				+ buf.limit() + " ,capacity: " + buf.capacity());
		
		buf.flip();
		System.out.println("after flip:");
		System.out.println("position: " + buf.position() + " ,limit= " 
				+ buf.limit() + " ,capacity: " + buf.capacity());
		
		buf.put(8);
		
		System.out.println("after flip:");
		System.out.println("position: " + buf.position() + " ,limit= " 
				+ buf.limit() + " ,capacity: " + buf.capacity());
		
		buf.position(0);
		
		System.out.println("buffer content:");
		while(buf.hasRemaining()) {
			int x = buf.get();
			System.out.println("x: " + x);
		}
	}

	

}
