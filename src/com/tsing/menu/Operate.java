package com.tsing.menu;

import java.io.File;

public class Operate {
	public static void add(){
		System.out.println("you choose the add operation");
		InputData input = new InputData();
		FileOperate fo = new FileOperate("c:" + File.separator + "person.txt");
		String name = input.getString("plz input name:");
		int age = input.getInt("plz input age:", "age must be integre!");
		Person per = new Person(name, age);
		try {
			fo.save(per);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("add succesfully!");
	}
	public static void delete(){
		System.out.println("you choose the delete operation");
		FileOperate fo = new FileOperate("c:" + File.separator + "person.txt");
		try {
			fo.save(null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("delete successfully!");
	}
	public static void update(){
		System.out.println("you choose the update operation");
		InputData input = new InputData();
		FileOperate fo = new FileOperate("c:" + File.separator + "person.txt");
		Person per =null;
		try {
			per = (Person) fo.load();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String name = input.getString("plz input the new name(origin name is:" + 
		per.getName() + "):");
		int age = input.getInt("plz input the new name(origin name is:" + 
				per.getAge() + "):","age must be integer");
		try {
			fo.save(per);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("update successfully!");
		
	}
	public static void find(){
		System.out.println("you choose the find operation");
		FileOperate fo = new FileOperate("c:" + File.separator + "person.txt");
		Person per = null;
		try {
			per = (Person) fo.load();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(per);
	}
	

}
