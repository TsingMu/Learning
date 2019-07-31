package com.tsing.consume;

public class Consumer implements Runnable{
	private Info info = null;
	public Consumer(Info info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			//System.out.println(this.info.getName() + " --> " + this.info.getContent());
			this.info.get();
		}
		
	}

}
