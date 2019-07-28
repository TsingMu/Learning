package com.tsing.thread;

public class SoldTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTicketThread my1 = new MyTicketThread("my1");
		MyTicketThread my2 = new MyTicketThread("my2");
		MyTicketThread my3 = new MyTicketThread("my3");
		new Thread(my1).start();
		new Thread(my2).start();
		new Thread(my3).start();

	}

}
