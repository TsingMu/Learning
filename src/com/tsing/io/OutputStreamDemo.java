package com.tsing.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("c:" + File.separator + "mouqing" + File.separator +"test.txt");
		
		OutputStream out = new FileOutputStream(f,true);
		
		String str="\r\nFUCK YOU£¡!!";
		
		byte b[] = str.getBytes();
		
		out.write(b);
		out.close();

	}

}
