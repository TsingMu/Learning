package com.tsing.io;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;

//import javax.imageio.stream.FileImageInputStream;

public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("c:" + File.separator + "mouqing" + File.separator +"test.txt");
		
		InputStream input = new FileInputStream(f);
		
		byte b[] = new byte[(int)f.length()];
		input.read(b);
		input.close();
		//System.out.println(len);
		System.out.println(new String(b));
		

	}

}
