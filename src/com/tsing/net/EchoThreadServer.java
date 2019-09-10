package com.tsing.net;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client = null;
		server = new ServerSocket(8888);
		boolean f = true;
		while(f) {
			System.out.println("server started.");
			client = server.accept();
			new Thread(new EchoThread(client)).start();
		}
		server.close();
		
	}

}
