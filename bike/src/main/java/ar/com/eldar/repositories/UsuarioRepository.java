package ar.com.eldar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.eldar.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	//modificamos la consulta y buscamos por una columan (nombre) para que luego podamos buscar un registro 
	//mediante su nombre al momento de hacer un login 
	
	
	
	//findBy${nombreDeLaColumna} 
	Usuario findByNombre(String nombre); //esto si lo hacemos en SQL seria asi : select * from usuario where nombre = ${nombre};
	

}
