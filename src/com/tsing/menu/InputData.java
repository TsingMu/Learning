package com.tsing.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {
	private BufferedReader buf = null;
	
	public InputData(){
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String getString(String info){
		String temp = null;
		System.out.println(info);
		try {
			temp = this.buf.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return temp;
	}
	
	public int getInt(String info,String err){
		int temp = 0;
		String str= null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d+$")){
				temp = Integer.parseInt(str);
				flag=false;
			}else{
				System.out.println(err);
			}
		}
		return temp;
	}
	
	public float getFloat(String info,String err){
		float temp = 0;
		String str= null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d+.?\\d+$")){
				temp = Float.parseFloat(str);
			}else{
				System.out.println(err);
			}
		}
		return temp;
	}
	
	public Date getDate(String info,String err){
		Date d = null;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
				try {
					d = sdf.parse(str);
				} catch (ParseException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				flag = false;
			}else{
				System.out.println(err);
			}
		}
		return d;
	}

}
