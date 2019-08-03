package com.tsing.classes;

import java.util.*;

public class LocaleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale zhLoc = new Locale("zh", "CN");
		Locale enLoc = new Locale("en", "US");
		Locale frLoc = new Locale("fr", "FR");
		
		ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);
		
		System.out.println("info : " + zhrb.getString("info") + enrb.getString("info") 
		+ frrb.getString("info"));
		
		

	}

}
