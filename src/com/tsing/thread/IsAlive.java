package com.tsing.thread;

class IsAliveThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName() + "���� -->" + i);
		}
	} 
	
}

public class IsAlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAliveThread iat = new IsAliveThread();
		
		Thread t = new Thread(iat, "FUCK");
		System.out.println("ִ��ǰ -->" + t.isAlive());
		t.start();
		
		for(int i=0;i<3;i++){
			System.out.println("Main ���� -->" + i);
		}
		
		System.out.println("ִ�к� -->" + t.isAlive());
		
		
		
		

	}

}
