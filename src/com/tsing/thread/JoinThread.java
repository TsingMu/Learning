package com.tsing.thread;

class MyJoinThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName() + " 运行-->" + i);
		}
	}
	
}

public class JoinThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJoinThread mjt = new MyJoinThread();
		Thread t =new Thread(mjt,"FUCK");
		t.start();
		
		for(int i=0 ; i<50 ; i++){
			if( i >10){
				try {
					t.join();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("Main 线程运行-->" + i);
		}

	} 

}
