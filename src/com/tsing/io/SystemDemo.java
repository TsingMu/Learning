package com.tsing.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//OutputStream out = System.out;
		//OutputStream err = System.err;
		InputStream in = System.in;
		StringBuffer sb = new StringBuffer();
		int temp = 0;
		while((temp = in.read()) != -1){
			char c = (char)temp;
			if(c == '\n'){
				break;
			}
			sb.append(c);
		}
		System.out.println(sb);
		
		in.close();
		

	}

}
