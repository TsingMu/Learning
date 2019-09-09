package com.tsing.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoBlob {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		String name = "WINGS.png";
		String sql = "insert into userblob (name,photo) values(?,?)";
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		ps = conn.prepareStatement(sql);
		
		File f = new File("/Users/tsingmu/Pictures/Wings.png");
		InputStream input = new FileInputStream(f);
		
		ps.setString(1, name);
		ps.setBinaryStream(2, input);
		ps.executeUpdate();
		
		sql = "select name,photo from userblob where id = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, 1);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			String qname = rs.getString(1);
			System.out.println("name: " + qname);
			Blob b  = rs.getBlob(2);
			FileOutputStream out = null;
			out = new FileOutputStream(new File("/Users/tsingmu/Pictures/wings2.gif"));
			out.write(b.getBytes(1, (int) b.length()));
			out.close();
		}
		
		ps.close();
		conn.close();

	}

}
