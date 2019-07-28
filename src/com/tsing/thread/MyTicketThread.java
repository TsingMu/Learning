package com.tsing.thread;

public class MyTicketThread implements Runnable{
	private int count = 5;
	private String name;
	public  MyTicketThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run(){
		for (int i=0; i<100 ; i++){
			if(count > 0){
				System.out.println(name + "sold: " + "ticket = " + count--);
			}
		}
	}
	

}
