package com.tsing.net;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DemoURL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http", "www.baidu.com", 80,"/index.html");
		InputStream in = url.openStream();
		Scanner scan = new Scanner(in);
		scan.useDelimiter("\n");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}

	}

}
