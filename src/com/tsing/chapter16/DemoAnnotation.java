package com.tsing.chapter16;

class Demo{
	@Deprecated
	public String getInfo(){
		return "fuck!!!";
	}
}

public class DemoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		System.out.println(d.getInfo());

	}

}
