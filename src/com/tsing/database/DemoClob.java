package com.tsing.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoClob {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		String name = "wings.txt";
		String sql = "insert into userclob(name,note) values (?,?)";
		ResultSet rs;
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		ps = conn.prepareStatement(sql);
		
		File f = new File("/Users/tsingmu/Documents/test.rtf");
		InputStream input = null;
		input = new FileInputStream(f);
		
		ps.setString(1, name);
		ps.setAsciiStream(2, input, (int)f.length());
		ps.executeUpdate();
		
		sql = "select * from userclob where name=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		rs = ps.executeQuery();
		
		if(rs.next()) {
			String resultName = rs.getString(2);
			Clob clob = rs.getClob(3);
			String note = clob.getSubString(1, (int)clob.length());
			System.out.println("name:" + resultName);
			System.out.println("content: " + note);
			System.out.println("-------------------");
			clob.truncate(500);
			System.out.println("part:" + clob.getSubString(1, (int)clob.length()));
		}
		
		
		
		ps.close();
		conn.close();

	}

}
