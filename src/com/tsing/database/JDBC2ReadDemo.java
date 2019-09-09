package com.tsing.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC2ReadDemo {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="select id,name,password,age,sex,birthday from user";
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		ps = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		rs = ps.executeQuery();
		
		System.out.println("second record:");
		rs.absolute(1);
		print(rs, 1);
		
		System.out.println("First record: ");
		rs.beforeFirst();
		print(rs, 1);
		
		System.out.println("last Record: ");
		rs.afterLast();
		print(rs, -1);
		
		rs.close();
		ps.close();
		conn.close();

	}
	
	public static void print(ResultSet rs , int re) throws Exception{
		if(re>0) {
			rs.next();
		}else {
			rs.previous();
		}
		
		int id = rs.getInt(1);
		String name = rs.getString(2);
		String pass = rs.getString(3);
		int age = rs.getInt(4);
		String sex = rs.getString(5);
		java.util.Date d = rs.getDate(6);
		System.out.print("id : " + id + ";");
		System.out.print("name: " + name + ";");
		System.out.print("password: " + pass + ";");
		System.out.print("age: " + age + ";");
		System.out.print("sex: " + sex + ";");
		System.out.println("birthday: " + d);
		System.out.println("------------------------");
				
	}

}
