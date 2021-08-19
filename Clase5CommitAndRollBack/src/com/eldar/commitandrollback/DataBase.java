package com.eldar.commitandrollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private final static String db = "eldarclase5";
	private final static String login = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://localhost/" + db;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Success Connection Data Base " + db);
			}
			return conn;
		} catch (SQLException e) {
			System.out.println("Mensaje Error : " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Mensaje Error : " + e.getMessage());
			e.printStackTrace();
		}

		return null;

	}

	public static void main(String[] args) {
		DataBase.getConnection();
	}

}
