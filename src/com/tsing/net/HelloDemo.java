package com.tsing.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null;
		server = new ServerSocket(8888);
		System.out.println("server started,waiting for connection!");
		client = server.accept();
		String str = "Hello World";
		out = new PrintStream(client.getOutputStream());
		out.println(str);
		out.close();
		client.close();
		server.close();

	}

}
