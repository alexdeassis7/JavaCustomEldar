package ar.com.eldar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.models.Bike;
import ar.com.eldar.repositories.BikeRepository;

//mediante esta anotacion sera suficiente para que spring la Framework 
//la publique como un rest Service
@RestController
//definimos la URI BASE: localhost:9090/api/v1/bikes
@RequestMapping("api/v1/bikes")
public class BikeController {
  
	//inyecto el pero para poder realizar las consultas contra nuestra DB
	@Autowired
	private BikeRepository bk ;
	
	//creamos nuestro primer end point para obtener el listado de bikes de la db 
	@GetMapping // la uri de este recurso sera : localhost:9090/api/v1/bikes
	public List<Bike> lista(){
		//esto me respondera un JSON (Java Script Object Notation)
		return bk.findAll();
	}
	
	//Este metodo recibe en el body de la peticion http un JSON qeu sera persistido mediante JPA
	//en nuestra db SLQite 
	//recordar que el id no debemos enviarlo ya que este se genera de manera automatica en la base 
	@PostMapping
	public void create(@RequestBody Bike bike) {
		bk.save(bike);
	}
	
	//este end point retorna un registro de bikes mediante el id recibido en la url 
	//URI DEL RECURSO : localhost:9090/api/v1/bikes/${id}
	@GetMapping("/{id}")
	public Bike getBike(@PathVariable("id") Long id) {
		System.out.println("Recibimo el siguiente id por path variable: " +id);
		return bk.getOne(id);
	}
	
	
}
