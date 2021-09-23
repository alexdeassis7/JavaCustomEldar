package ar.com.eldar.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

//import lombok.Data; Imvestigar anotaciones de libreria lombok en el siguiente link 
//https://projectlombok.org/features/all

//Este sera nuestro objeto de negocio  POJO
//@Data

@Entity

//ignoramos la serializacion innecesaria de la entida que se produce internamente y agrega 
//campos adicionales (hibernateLazyInitializer,handler)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private BigDecimal purchasePrice;
	private Date purchaseDate;
	private Boolean contact;

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Boolean getContact() {
		return contact;
	}

	public void setContact(Boolean contact) {
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getPurcharsePrice() {
		return purchasePrice;
	}

	public void setPurcharsePrice(BigDecimal purcharsePrice) {
		this.purchasePrice = purcharsePrice;
	}

}
