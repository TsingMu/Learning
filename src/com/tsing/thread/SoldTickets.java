package com.tsing.thread;

public class SoldTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyTicketThread my1 = new MyTicketThread();
		//MyTicketThread my2 = new MyTicketThread("my2");
		//MyTicketThread my3 = new MyTicketThread("my3");
		new Thread(new MyTicketThread()).start();
		new Thread(new MyTicketThread()).start();
		new Thread(new MyTicketThread()).start();
		//new Thread(my1).start();

	}

}
