package com.tsing.thread;

class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	
	public void run() {
		for (int i=0 ; i<10 ;i++){
			System.out.println(name + " run,i=" + i);
		}
	}
	
}

public class ThreadDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("Thread A");
		MyThread mt2 = new MyThread("Thread B");
		
		mt1.start();
		mt2.start();

	}

}
