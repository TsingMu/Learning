package com.tsing.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;

public class DemoPreparedStatement {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		String name = "test";
		int age = 9;
		String passwd = "******";
		String sex = "F";
		String birthday = "2008-08-08";
		Date temp = null;
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		java.sql.Date bir = new java.sql.Date(temp.getTime());
		
		String sql = "insert into user(name,password,age,sex,birthday)"
				+ "Values(?,?,?,?,?)";
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setString(2, passwd); 
		pstmt.setInt(3, age);
		pstmt.setString(4, sex);
		pstmt.setDate(5, bir);
		
		pstmt.executeUpdate();
		System.out.println("insert finished!");
		
		sql = "update user set password=? , sex='F' where id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "test");
		pstmt.setInt(2, 2);
		pstmt.executeUpdate();
		
		sql = "delete from user where id > ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 4);
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
	}

}
