package com.tsing.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EchoThread implements Runnable{
	private Socket client = null;
	public EchoThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintStream out = null;
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintStream(client.getOutputStream());
			boolean flag = true;
			while(flag) {
				String str = buf.readLine();
				if(str == null || "".equals(str)) {
					flag = false;
				}else {
					if("bye".equals(str)) {
						flag = false;
					}else {
						out.println("ECHO: " + str);
					}
				}
			}
			out.close();
			client.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
