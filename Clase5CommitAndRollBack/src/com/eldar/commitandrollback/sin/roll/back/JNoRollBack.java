package com.eldar.commitandrollback.sin.roll.back;

import java.sql.*;

import com.eldar.commitandrollback.DataBase;

public class JNoRollBack {

	public static void main(String[] args) {

		Connection connection = DataBase.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
			// se preparan las sentencias SQL
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (?, ?)");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (?, ?, ?)");

			System.out.println("Primer INSERT en MITABLA");
			stmt1.setInt(1, 36966879);
			stmt1.setString(2, "pablo@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Segundo INSERT en MITABLA");
			stmt1.setInt(1, 36555666);
			stmt1.setString(2, "ivan@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Tercer INSERT en MITABLA");
			stmt1.setInt(1, 36777898);
			stmt1.setString(2, "fernando@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Primer INSERT en MIOTRATABLA");
			stmt2.setString(1, "Sharon");
			stmt2.setString(2, "Domanico");
			// forzamos un error enviando un String en lugar de un integer
			//stmt2.setString(3, "Soy un Error forzado");
			//ejecutamos la consulta sin error (beria impactar todos los datos)
			stmt2.setInt(3, 15);
			stmt2.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Mensaje : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				// liberamos los recursos en caso de ser necesario
				if (stmt1 != null)
					stmt1.close();
				if (stmt2 != null)
					stmt2.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("Mensaje2 : " + e.getMessage());
				e.printStackTrace();
			}

		}

	}
}
