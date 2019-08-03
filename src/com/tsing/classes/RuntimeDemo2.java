package com.tsing.classes;

public class RuntimeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		Process pro = null;
		
		try {
			pro = run.exec("notepad.exe");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		pro.destroy();

	}

}
