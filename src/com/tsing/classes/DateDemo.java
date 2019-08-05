package com.tsing.classes;

import java.text.*;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df1 ;
		DateFormat df2;
		
		df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));
		df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD, 
				new Locale("zh", "CN"));
		
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));
	}

}
