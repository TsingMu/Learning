package com.tsing.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Student{
	private String name;
	private int age;
	private List<Course> allCourse;
	
	public Student(){
		this.allCourse = new ArrayList<Course>();
	}
	
	public Student(String name , int age){
		this();
		this.setAge(age);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Course> getAllCourse() {
		return allCourse;
	}
	
	public String toString(){
		return "name: " + this.getName() + ";age: " + this.getAge();
	}
}