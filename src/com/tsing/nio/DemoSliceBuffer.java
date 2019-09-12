package com.tsing.nio;

import java.nio.IntBuffer;

public class DemoSliceBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer buf = IntBuffer.allocate(10);
		IntBuffer sub = null;
		 
		for(int i = 0;i < 10;i++) {
			buf.put(2 * i + 1);
		}
		
		buf.position(2);
		buf.limit(6);
		sub = buf.slice();
		
		for(int i = 0;i < sub.capacity();i++) {
			int temp = sub.get(i);
			sub.put(temp - 1);
		}
		
		buf.flip();
		buf.limit(buf.capacity());
		
		while(buf.hasRemaining()) {
			int x = buf.get();
			System.out.println(x);
		}
	}

}
