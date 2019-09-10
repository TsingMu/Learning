package com.tsing.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class TranDemo {
	public static final String DBDRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPASS="Tsing@1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn;
		Statement st;
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		conn.setAutoCommit(false);
		st = conn.createStatement();
		
		st.executeUpdate("insert into user(name,password,age,sex,birthday)"
				+ " values('t1','tttt',1,'F','2019-09-09')");
		st.executeUpdate("insert into user(name,password,age,sex,birthday)"
				+ " values('t2','tttt',1,'F','2019-09-09')");
		Savepoint sp = conn.setSavepoint();
		st.executeUpdate("insert into user(name,password,age,sex,birthday)"
				+ " values('t'3','tttt',1,'F','2019-09-09')");
		st.executeUpdate("insert into user(name,password,age,sex,birthday)"
				+ " values('t4','tttt',1,'F','2019-09-09')");
		st.executeUpdate("insert into user(name,password,age,sex,birthday)"
				+ " values('t5','tttt',1,'F','2019-09-09')");
		
		try {
			conn.rollback(sp);
			conn.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		st.close();
		conn.close();
	}

}
