package com.tsing.net;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DemoURLConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.eminem.com");
		URLConnection con = url.openConnection();
		System.out.println("content size: " + con.getContentLength());
		System.out.println("content type: " + con.getContentType());

	}

}
