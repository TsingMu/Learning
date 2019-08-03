package com.tsing.classes;

import java.util.ResourceBundle;

public class ResourceBundledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rb = ResourceBundle.getBundle("message");
		System.out.println("Info:" + rb.getString("info"));

	}

}
