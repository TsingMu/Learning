package com.tsing.consume;

public class Info {
	private String name="Tsing";
	private String content="Rap god";
	private boolean flag = false;// true:can produce ;false: can consume.
	
	public synchronized void set(String name,String content){
		if(!flag){
			try {
				super.wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		this.name = name;
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.content = content;
		this.flag = false;
		super.notify();
	}
	
	public synchronized void get(){
		if(flag){
			try {
				super.wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(this.name + " --> " + this.content);
		this.flag = true;
		super.notify();
	}
}
