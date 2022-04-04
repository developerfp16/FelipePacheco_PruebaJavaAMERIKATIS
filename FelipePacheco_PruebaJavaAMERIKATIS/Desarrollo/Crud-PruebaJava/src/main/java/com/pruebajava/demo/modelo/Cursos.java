package com.pruebajava.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Cursos")

public class Cursos {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ID_Curso;
	private String Nombre;
	private Double Costo;
	private String Descripcion;
	private float Horas;
	private String Dirigido;
	private String Modalidad;
	private int id_modalidad;
	
	public Cursos() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cursos(int iD_Curso, String nombre, Double costo, String descripcion, float horas, String dirigido,
			String modalidad, int id_modalidad) {
		super();
		ID_Curso = iD_Curso;
		Nombre = nombre;
		Costo = costo;
		Descripcion = descripcion;
		Horas = horas;
		Dirigido = dirigido;
		Modalidad = modalidad;
		this.id_modalidad = id_modalidad;
	}



	public int getID_Curso() {
		return ID_Curso;
	}

	public void setID_Curso(int iD_Curso) {
		ID_Curso = iD_Curso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Double getCosto() {
		return Costo;
	}

	public void setCosto(Double costo) {
		Costo = costo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public float getHoras() {
		return Horas;
	}

	public void setHoras(float horas) {
		Horas = horas;
	}

	public String getDirigido() {
		return Dirigido;
	}

	public void setDirigido(String dirigido) {
		Dirigido = dirigido;
	}

	public String getModalidad() {
		return Modalidad;
	}

	public void setModalidad(String modalidad) {
		Modalidad = modalidad;
	}

	public int getId_modalidad() {
		return id_modalidad;
	}

	public void setId_modalidad(int id_modalidad) {
		this.id_modalidad = id_modalidad;
	}
	

}
