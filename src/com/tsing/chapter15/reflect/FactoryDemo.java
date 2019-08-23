package com.tsing.chapter15.reflect;

interface Fruit{
	public void eat();
}

class Apple implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat apple");
	}
	
}

class Orange implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat orange");
	}
	
}

class Factory{
	public static Fruit getInstance(String className){
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f =Factory.getInstance("com.tsing.chapter15.reflect.Apple");
		if(f != null){
			f.eat();
		}

	}

}
