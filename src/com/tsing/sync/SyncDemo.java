package com.tsing.sync;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SyncCodeBlock sync = new SyncCodeBlock();
		Thread t1 = new Thread(sync); 
		Thread t2 = new Thread(sync); 
		Thread t3 = new Thread(sync); 
		t1.start();
		t2.start();
		t3.start();

	}

}
