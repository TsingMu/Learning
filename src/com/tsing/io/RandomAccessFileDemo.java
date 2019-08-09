package com.tsing.io;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("c:" + File.separator + "mouqing" + File.separator +"test.txt");
		RandomAccessFile raf = null;
		
		raf = new RandomAccessFile(f, "rw");
		
		String name =null;
		int age = 0;
		name="Eminem  ";
		age=40;
		raf.writeBytes(name);
		raf.writeInt(age);
		
		raf.close();

	}

}
