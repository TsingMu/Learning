package com.tsing.io;

import java.io.File;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:" + File.separator +"test" );
		print(file);

	}
	
	public static void print(File file){
		if(file != null){
			if(file.isDirectory()){
				File f[] = file.listFiles();
				if(f != null){
					for(int i=0; i<f.length;i++){
						print(f[i]);
					}
				}
			}else{
				System.out.println(file);
			}
		}
	}

}
