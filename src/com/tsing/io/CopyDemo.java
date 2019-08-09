package com.tsing.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("must input 2 paras!");
			System.out.println("example:source ,destiny");
			System.exit(1);
		}
		
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		if(!f1.exists()){
			System.out.println("source file doesn't exit!");
			System.exit(1);
		}
		
		InputStream input=null;
		OutputStream out = null;
		try {
			input = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			out = new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if(input != null && out != null){
			int temp = 0;
			byte[] data = new byte[1024];
			try {
				while((temp = input.read(data)) != -1){
					out.write(data,0,temp);
				}
				System.out.println("Copy Complete");
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Copy failed");
			}
			
			try{
				input.close();
				out.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		

	}

}
