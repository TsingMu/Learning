package com.tsing.chapter13;

import java.util.Iterator;

public class TestDemo{
	public static void main(String[] args) {
		Course c1 = new Course("english", 3);
		Course c2 = new Course("math", 5);
		Course c3 = new Course("PE",4);
		Student s1 = new Student("Tsing", 20);
		Student s2 = new Student("van",20);
		Student s3 = new Student("fuck",18);
		Student s4 = new Student("cao",16);
		
		c1.getAllStudent().add(s3);
		c1.getAllStudent().add(s4);
		
		c2.getAllStudent().add(s1);
		c2.getAllStudent().add(s2);
		
		c3.getAllStudent().add(s1);
		c3.getAllStudent().add(s2);
		c3.getAllStudent().add(s3);
		c3.getAllStudent().add(s4);
		
		s1.getAllCourse().add(c3);
		s1.getAllCourse().add(c2);
		
		s2.getAllCourse().add(c3);
		s2.getAllCourse().add(c2);
		
		s3.getAllCourse().add(c3);
		s3.getAllCourse().add(c1);
		
		s4.getAllCourse().add(c3);
		s4.getAllCourse().add(c1);
		
		System.out.println(c1);
		Iterator<Student> iter = c1.getAllStudent().iterator();
		while(iter.hasNext()){
			System.out.println("\t|-" + iter.next());
		}
		
		System.out.println(s1);
		Iterator<Course> iter1;
		iter1 = s1.getAllCourse().iterator();
		while(iter1.hasNext()){
			System.out.println("\t|-" + iter1.next());
		}
	}
}