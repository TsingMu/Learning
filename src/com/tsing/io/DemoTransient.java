package com.tsing.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

 class Person implements Serializable{
	private  String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "name: " + this.name + " age: " +this.age;
	}
}

public class DemoTransient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person[] per={new Person("Tsing1", 10),new Person("Tsing2", 20),
				new Person("Tsing3", 30)
		};
		
		ser(per);
		Object[] o = dser();
		for(int i=0 ; i<o.length;i++){
			System.out.println(o[i]);
		}
	}

	private static void ser(Object obj[]) throws Exception{
		// TODO Auto-generated method stub
		File f = new File("C:" + File.separator + "Transient.txt");
		ObjectOutputStream oos;
		OutputStream out = new FileOutputStream(f);
		oos = new ObjectOutputStream(out);
		oos.writeObject(obj);
		oos.close();
	}

	private static Object[] dser() throws Exception{
		// TODO Auto-generated method stub
		File f = new File("C:" + File.separator +"Transient.txt");
		ObjectInputStream ois;
		InputStream input = new FileInputStream(f);
		ois = new ObjectInputStream(input);
		Object obj[] = (Object[]) ois.readObject();
		ois.close();
		return obj;
	}

}
