package com.tsing.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoScnanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("e:" + File.separator +"test.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer();
		while(scan.hasNext()){
			sb.append(scan.next()).append("\n");
		}
		
		System.out.println(sb);

	}

}
