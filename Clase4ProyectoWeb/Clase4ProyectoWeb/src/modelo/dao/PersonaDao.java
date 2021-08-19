package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.conexion.Conexion;
import modelo.vo.PersonaVo;




public class PersonaDao
{

	public void registrarPersona(PersonaVo miPersona)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('"+miPersona.getIdPersona()+"', '"
					+miPersona.getNombrePersona()+"', '"+miPersona.getEdadPersona()+"', '"
					+miPersona.getProfesionPersona()+"', '"+miPersona.getTelefonoPersona()+"')");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
		}
	}

	public PersonaVo buscarPersona(int codigo) 
	{
		Conexion conex= new Conexion();
		PersonaVo persona= new PersonaVo();
		boolean existe=false;
		try {
			//Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			 }
			res.close();
			conex.desconectar();
					
					
			} catch (SQLException e) {
					System.out.println(e);
			}
		
			if (existe) {
				return persona;
			}
			else return null;				
	}

	public void modificarPersona(PersonaVo miPersona) {
		
		Conexion conex= new Conexion();
		try{
			String consulta="UPDATE persona SET id= ? ,nombre = ? , edad=? , profesion=? , telefono= ? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
            estatuto.setInt(1, miPersona.getIdPersona());
            estatuto.setString(2, miPersona.getNombrePersona());
            estatuto.setInt(3, miPersona.getEdadPersona());
            estatuto.setString(4, miPersona.getProfesionPersona());
            estatuto.setInt(5,miPersona.getTelefonoPersona());
            estatuto.setInt(6, miPersona.getIdPersona());
            estatuto.executeUpdate();

         

        }catch(SQLException	 e){

            System.out.println(e);

        }
	}

	public void eliminarPersona(String codigo)
	{
		Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id='"+codigo+"'");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
		}
	}

}
