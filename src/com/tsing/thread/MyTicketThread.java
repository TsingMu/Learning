package com.tsing.thread;

public class MyTicketThread implements Runnable{
	private int count = 5;
	
	
	public void run(){
		for (int i=0; i<100 ; i++){
			if(count > 0){
				count--;
				System.out.println(Thread.currentThread().getName() + " sold: " + "ticket = " + count);
				
			}
		}
	}
	

}
