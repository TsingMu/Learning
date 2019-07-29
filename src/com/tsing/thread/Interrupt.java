package com.tsing.thread;

class MyInterruptThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1. entered the Run function.");
		try {
			Thread.sleep(10000);
			System.out.println("2. finished sleep.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("3. the sleep has been interrupted.");
			return;
		}
		System.out.println("4.the run function returned normally");
	}
	
}


public class Interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterruptThread mit = new MyInterruptThread();
		Thread t = new Thread(mit, "Thread");
		t.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ooops,fuck that!");
		}
		t.interrupt();

	}

}
