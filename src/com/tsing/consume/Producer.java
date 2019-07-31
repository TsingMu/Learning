package com.tsing.consume;

public class Producer implements Runnable{
	private Info info = null;
	
	public  Producer(Info info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 0; i < 50; i++) {
			if(flag){
				this.info.set("Tsing", "Rap God");
				flag = false;
			}else{
				this.info.set("Eminem", "Slim Shady");
				flag = true;
			}
		}
		
	}

}
