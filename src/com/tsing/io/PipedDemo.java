package com.tsing.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{
	private PipedOutputStream pos = null;
	public  Send(){
		this.pos = new PipedOutputStream();
	}
	public void run(){
		String str="Fuck you!!!";
		try {
			this.pos.write(str.getBytes());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			this.pos.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public PipedOutputStream getPos(){
		return pos;
	}
}

class Receive implements Runnable{
	private PipedInputStream pis = null;
	public   Receive() {
		// TODO Auto-generated constructor stub
		this.pis = new PipedInputStream();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		byte[] b =new byte[1024];
		int len = 0;
		try {
			len=this.pis.read(b);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			this.pis.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Receive Message:" + new String(b,0,len));
	}
	
	public PipedInputStream getPis(){
		return pis;
	}
	
}

public class PipedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Send s = new Send();
		Receive r = new Receive();
		try {
			s.getPos().connect(r.getPis());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		new Thread(s).start();
		new Thread(r).start();

	}

}
