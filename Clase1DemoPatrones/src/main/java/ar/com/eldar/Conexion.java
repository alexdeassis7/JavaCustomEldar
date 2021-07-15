package ar.com.eldar;

import java.sql.*;

public class Conexion {
	// en esta clase centralizamos los datos de la conexion a la db
	static String db = "persona";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;

	Connection conn = null;

	public Conexion() {

		try {
			// obtenemos el driver de mysql
			Class.forName("com.mysql.jdbc.Driver");
			// otenemos la conexion a la base
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Se logro conectar exitosamente a la DB : " + db);
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}
	
	public Connection getConnection() {
		return conn;
	}

	public static void main(String[] args) {
			Conexion conex = new Conexion();
		
	}

}
