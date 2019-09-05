package com.tsing.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryDemo {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		String name = "tsing";
		ResultSet rs = null;
		String sql = "select * from user where name != ?";
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name1 = rs.getString("name");
			String pass = rs.getString("password");
			String sex = rs.getString("sex");
			int age = rs.getInt("age");
			java.util.Date d = rs.getDate("birthday");
			System.out.println("id: " + id);
			System.out.println("name: " + name1);
			System.out.println("passwd: " + pass);
			System.out.println("age: " + age);
			System.out.println("sex: " + sex);
			System.out.println("birthday: " + d);
			System.out.println("-------------------------");
		}
		
		rs.close();
		pstmt.close();
		conn.close();

	}

}
