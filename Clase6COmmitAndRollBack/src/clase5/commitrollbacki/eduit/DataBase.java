package clase5.commitrollbacki.eduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private static String url = "jdbc:sqlite:basededatos.s3db";

	public static Connection getConnection() {
		// nombre del jar sqlite-jdbc-3.7.2.jar
		try {
			Connection conn = null;
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			if (conn != null) {
				System.out.println("se obtubo la conexion a la base");
			}
			return conn;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		return null;

	}

}
