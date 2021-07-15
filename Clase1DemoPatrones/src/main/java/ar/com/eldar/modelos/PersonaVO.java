package ar.com.eldar.modelos;

public class PersonaVO {

	private Integer idPersona;
	private String nombrePersona;
	private Integer edadPersona;
	private String profesionPersona;
	private long telefonoPersona;

	public PersonaVO() {
	}

	public PersonaVO(Integer idPersona, String nombrePersona, Integer edadPersona, String profesionPersona,
			long telefonoPersona) {
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public long getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(long telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

}
