package com.tsing.thread;

class Ex1Thread extends Thread{
	private int time;
	public Ex1Thread(String name,int time){
		super(name);
		this.time = time;
	}
	
	public void run(){
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "has slept" + this.time + "ms");
	}
}

public class ExecDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Thread et1 = new Ex1Thread("A", 10000);
		Ex1Thread et2 = new Ex1Thread("B", 20000);
		Ex1Thread et3 = new Ex1Thread("C", 30000);
		
		et1.start();
		et2.start();
		et3.start();

	}

}
