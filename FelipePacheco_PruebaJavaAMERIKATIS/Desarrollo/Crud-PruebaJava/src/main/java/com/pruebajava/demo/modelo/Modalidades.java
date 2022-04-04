package com.pruebajava.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="modalidades")

public class Modalidades {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idModalidad;
	private String nombreModalidad;
	private String descripcionModa;
	
	public  Modalidades() {
		
	}
	
	public Modalidades(int idModalidad, String nombreModalidad, String descripcionModa) {
		super();
		this.idModalidad = idModalidad;
		this.nombreModalidad = nombreModalidad;
		this.descripcionModa = descripcionModa;
	}

	public int getIdModalidad() {
		return idModalidad;
	}

	public void setIdModalidad(int idModalidad) {
		this.idModalidad = idModalidad;
	}

	public String getNombreModalidad() {
		return nombreModalidad;
	}

	public void setNombreModalidad(String nombreModalidad) {
		this.nombreModalidad = nombreModalidad;
	}

	public String getDescripcionModa() {
		return descripcionModa;
	}

	public void setDescripcionModa(String descripcionModa) {
		this.descripcionModa = descripcionModa;
	}
	
	

}
