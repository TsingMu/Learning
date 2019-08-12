package com.tsing.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.tsing.learning.PersonWithEnc;

public class DemoObjectOutputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("e:" + File.separator +"test.txt");
		ObjectOutputStream oos = null;
		OutputStream out = new FileOutputStream(f);
		oos = new ObjectOutputStream(out);
		oos.writeObject(new PersonWithEnc("Tsing",18));
		oos.close();
		
		ObjectInputStream ois= null;
		InputStream input = new FileInputStream(f);
		ois = new ObjectInputStream(input);
		Object obj = ois.readObject();
		ois.close();
		System.out.println(obj);

	}

}
