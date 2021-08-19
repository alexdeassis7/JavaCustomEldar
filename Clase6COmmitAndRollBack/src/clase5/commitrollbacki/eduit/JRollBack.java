package clase5.commitrollbacki.eduit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JRollBack {
	
//	ACID (Atomicidad , Consistencia ,Ailamiento ,Surabilidad);
	
	public static void main(String[] args) {

		Connection connection = DataBase.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
			//se desactiva el modo de confirmacion automatica
			connection.setAutoCommit(false);
			// se preparan las sentencias SQL
			
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (? , ?)");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (? , ? ,?)");

			System.out.println("Primer INSERT en [mitabla]");
			stmt1.setInt(1, 111111);
			stmt1.setString(2, "adeassis@gmail.com");
			stmt1.executeUpdate();
			
			System.out.println("Segundo INSERT en [mitabla]");
			stmt1.setInt(1, 222222);
			stmt1.setString(2, "AdrianaCarnero@gmail.com");
			stmt1.executeUpdate();
			
			System.out.println("Tercer INSERT en [mitabla]");
			stmt1.setInt(1, 333333);
			stmt1.setString(2, "marcelo@gmail.com");
			stmt1.executeUpdate();
			
			System.out.println("Primer INSERT en [miOtraTabla]");
			stmt2.setString(1, "Leo");
			stmt2.setInt(5, 45);
			stmt2.setString(2, "Piffer");

			stmt2.executeUpdate();
			connection.commit();
			
		} catch (Exception e) {
			
			System.out.println("ERROR : " + e.getCause());
			e.printStackTrace();
			if(connection != null) {
				System.out.println("Haciendo rollBack de posibles Cambios ");
				try {
					connection.rollback();
				} catch (Exception e2) {
					System.out.println("no se logro volver atras lo cambioss ERROR GRAVE de atomicidad y consistencia ");
				}
			}
			
		} finally {
			//liberamos los recursos en caso de ser nensario 
			try {
				if(stmt1 != null) stmt1.close();
				if(stmt2 != null) stmt2.close();
				if(connection != null) connection.close();				
			} catch (SQLException e) {
				System.out.println("ERROR 2 : " + e.getMessage());
			}
		}

	}
	
}
