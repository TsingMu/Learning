package com.tsing.thread;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunThread mrt1 = new MyRunThread("Thread A");
		MyRunThread mrt2 = new MyRunThread("Thread B");
		Thread t1 = new Thread(mrt1);
		Thread t2 = new Thread(mrt2);
		
		t1.start();
		t2.start();

	}

}

class MyRunThread implements Runnable{
	private String name;
	public  MyRunThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++){
			System.out.println(name + " Run,i=" + i);
		}
		
	}
	
}
