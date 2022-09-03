package com.jacobsheldon.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstExample {
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
	static final String USER = "root";
	static final String QUERY = "CREATE TABLE users (id INTEGER not NULL, PRIMARY KEY (id))";
	
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, "");
			Statement stmt = conn.createStatement();) {
			stmt.execute(QUERY);
			conn.close();
			System.out.println("Execute successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
