package com.tsing.database;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectionDemo01 {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		
		String name="lsy";
		String passwd="fuck";
		int age = 29;
		String sex = "女";
		String birthday = "1990-01-05";
		String sql = "insert into user(name,password,age,sex,birthday)"
				+ "values('"+ name +"','"+passwd+"','"+age+"','"+sex+"','"+birthday+"')";
		
		try {
			Class.forName(DBDRIVER);
			System.out.println("connect sucessfully!");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			conn = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(conn);
		
		try {
			stmt = (Statement) conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			stmt.executeUpdate(sql);
			System.out.println("insert finish!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("insert fail");
		}
		
		try {
			stmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
