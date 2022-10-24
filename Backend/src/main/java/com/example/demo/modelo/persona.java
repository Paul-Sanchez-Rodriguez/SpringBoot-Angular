package com.example.demo.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="PERSONA")
public class persona{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	
	@Column(name = "APELLIDOPATERNO")
	private String apellidopat;
	

	@Column(name = "APELLIDOMATERNO")
	private String apellidomat;
	
	
	@Column(name = "ESTADO")
	private String estado;
	
	
	@Column(name = "CELULAR")
	private String celular;
	
	public persona() {
		
	}

	public persona(String nombre, String apellidopat, String apellidomat, String estado, String celular) {
		super();
		this.nombre = nombre;
		this.apellidopat = apellidopat;
		this.apellidomat = apellidomat;
		this.estado = estado;
		this.celular = celular;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidopat() {
		return apellidopat;
	}

	public void setApellidopat(String apellidopat) {
		this.apellidopat = apellidopat;
	}

	public String getApellidomat() {
		return apellidomat;
	}

	public void setApellidomat(String apellidomat) {
		this.apellidomat = apellidomat;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	

}
