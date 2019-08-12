package com.tsing.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DOSDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataOutputStream dos ;
		File f = new File("e:"+ File.separator + "order.txt");
		dos = new DataOutputStream(new FileOutputStream(f));
		String[] names={"≤›","∏…","»’"};
		float[] prices = {90f,30.5f,50f};
		int[] nums={3,2,1};
		
		for (int i = 0; i < names.length; i++) {
			dos.writeChars(names[i]);
			dos.writeChar('\t');
			dos.writeFloat(prices[i]);
			dos.writeChar('\t');
			dos.writeInt(nums[i]);
			dos.writeChar('\n');
		}
		
		dos.close();
		System.out.println(System.getProperty("file.encoding"));

	}

}
