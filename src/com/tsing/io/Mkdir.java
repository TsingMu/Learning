package com.tsing.io;

import java.io.File;

public class Mkdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:" + File.separator + "test");
//		if(f.getParentFile().exists()){
//			f.mkdir();
//		}
		File str[] = f.listFiles();
		
		for(int i=0; i<str.length ; i++){
			System.out.println(str[i]);
		}

	}

}
