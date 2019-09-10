package com.tsing.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class HelloClientDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket client = null;
		client = new Socket("localhost", 8888);
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		String str = buf.readLine();
		System.out.println("Server content: " + str);
		client.close();
		buf.close();

	}

}
