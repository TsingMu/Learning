package com.tsing.thread;

import org.omg.PortableServer.THREAD_POLICY_ID;

class MyYieldThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0 ; i<5; i++){
			System.out.println(Thread.currentThread().getName() + " Runing --> " + i);
			if(3 == i){
				System.out.println("Yield:");
				Thread.currentThread().yield();
			}
		}
	}
	
}

public class Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyYieldThread myt= new MyYieldThread();
		Thread t1 = new Thread(myt,"Thread A");
		Thread t2 = new Thread(myt,"Thread B");
		t1.start();
		t2.start();

	}

}
