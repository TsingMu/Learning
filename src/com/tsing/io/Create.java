package com.tsing.io;

import java.io.File;
import java.io.*;

public class Create {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String path = "c:" + File.separator + "test.txt";
		File f = new File(path);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Thread.sleep(5000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if(f.exists()){
			f.delete();
		}

	}

}
