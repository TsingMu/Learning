package com.tsing.sync;

public class NonSync implements Runnable{
	private int count = 5;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0 ; i<100 ; i++){
			if(count > 0 ){
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +" sold ticket: count= " + count--);
			}
		}
		
	}
	

}
