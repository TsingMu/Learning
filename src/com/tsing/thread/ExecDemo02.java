package com.tsing.thread;

class ExecThread02 implements Runnable{
	private String name;
	private int time;
	
	public ExecThread02(String name,int time) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.time = time;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(this.name + " has slept for " + this.time + " ms");
		
	}
	
}

public class ExecDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecThread02 et1 = new ExecThread02("A", 10000);
		ExecThread02 et2 = new ExecThread02("B", 20000);
		ExecThread02 et3 = new ExecThread02("C", 30000);
		
		new Thread(et1).start();
		new Thread(et2).start();
		new Thread(et3).start();

	}

}
