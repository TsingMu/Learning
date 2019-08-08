package com.tsing.io;

import java.io.File;
import java.io.*;

public class Create {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "c:" + File.separator + "test.txt";
		File f = new File(path);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Thread.sleep(5000);
		
		if(f.exists()){
			f.delete();
		}

	}

}
