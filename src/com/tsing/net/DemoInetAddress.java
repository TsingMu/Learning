package com.tsing.net;

import java.net.InetAddress;

public class DemoInetAddress {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InetAddress locAdd,remAdd;
		locAdd = InetAddress.getLocalHost();
		remAdd = InetAddress.getByName("www.github.com");
		
		System.out.println("local ip: " + locAdd.getHostAddress());
		System.out.println("Git ip: " + remAdd.getHostAddress());
		System.out.println("reachable: " + locAdd.isReachable(50000));

	}

}
