package com.tsing.learning;

public class ExamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("09012227", "Tsing", 100, 99, 98);
		st.tell();
		
		System.out.println();
		
		Student st1 = new Student();
		st1.tell();

	}

}

class Student{
	private String stuno;
	private String name;
	private double math;
	private double english;
	private double computer;
	
	public Student(){}
	
	public Student(String s,String n,double m,double e,double c){
		this.setComputer(c);
		this.setEnglish(e);
		this.setMath(m);
		this.setName(n);
		this.setStuno(s);
	}
	
	public String getStuno(){
		return this.stuno;
	}	
	public void setStuno(String s){
		this.stuno = s;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String n){
		this.name = n;
	}
	
	
	public double getMath(){
		return this.math;
	}
	public void setMath(double m){
		this.math = m;
	}
	
	public double getEnglish(){
		return this.english;
	}
	public void setEnglish(double e){
		this.english = e;
	}
	
	public double getComputer(){
		return this.computer;
	}
	public void setComputer(double c){
		this.computer = c;
	}
	
	public double getAll(){
		return (this.computer + this.english + this.math);
	}
	
	public double getAverage(){
		return (this.getAll()/3);
	}
	
	public double getMax(){
		double max = this.math;
		max = max > this.computer ? max : this.computer;
		max = max > this.english ? max : this.english;
		return max;
	}
	
	public void tell(){
		System.out.println("学号为：" + this.stuno);
		System.out.println("姓名为：" + this.name);
		System.out.println("英语成绩：" + this.english);
		System.out.println("数学成绩：" + this.math);
		System.out.println("计算机成绩：" + this.computer);
		System.out.println("总成绩：" + this.getAll());
		System.out.println("平均分：" + this.getAverage());
		System.out.println("最高分：" + this.getMax());
	}
	
	
}
