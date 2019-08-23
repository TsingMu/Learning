package com.tsing.chapter15.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

class Init{
	public static Properties getPro(){
		Properties pro = new Properties();
		File f = new File("c:" + File.separator +"mouqing" 
				+ File.separator + "fruit.properties");
		try {
			if(f.exists()){
				pro.load(new FileInputStream(f));
			}else{
				pro.setProperty("apple", "com.tsing.chapter15.reflect.Apple");
				pro.setProperty("orange", "com.tsing.chapter15.reflect.Orange");
				pro.store(new FileOutputStream(f), "FRUIT CLASS");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return pro;
	}
}

public class FactoryFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro = Init.getPro();
		Fruit f = Factory.getInstance(pro.getProperty("apple"));
		if(f != null){
			f.eat();
		}

	}

}
