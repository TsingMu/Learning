package com.tsing.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCBatchDemo {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into user(name,password,age,sex,birthday)"
				+" values(?,?,?,?,?)";
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		ps = conn.prepareStatement(sql);
		
		for(int i=0 ; i<10 ;i++) {
			ps.setString(1, "test" + i);
			ps.setString(2, "eminem" + i);
			ps.setInt(3, 20 + i);
			ps.setString(4, "男");
			ps.setDate(5, new Date(new java.util.Date().getTime()));
			ps.addBatch();
		}
		int[] temp = ps.executeBatch();
		System.out.println("updated " + temp.length + " records");
		ps.close();
		conn.close();
	}

}
