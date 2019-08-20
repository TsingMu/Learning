package com.tsing.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private int credit;
	private List<Student> allStudent;
	
	public Course(){
		this.allStudent = new ArrayList<Student>();
	}
	
	public Course(String name, int credit){
		this();
		this.setCredit(credit);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public List<Student> getAllStudent() {
		return allStudent;
	}
	public void setAllStudent(List<Student> allStudent) {
		this.allStudent = allStudent;
	}
	
	public String toString(){
		return "course name: " +this.getName() +";credit: " + this.getCredit();
	}

}
