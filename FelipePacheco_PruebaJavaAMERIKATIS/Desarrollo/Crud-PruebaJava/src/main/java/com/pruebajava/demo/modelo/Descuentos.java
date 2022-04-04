package com.pruebajava.demo.modelo;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "descuentos")
public class Descuentos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idDescuentos;
	private String  Nombredescuento;
	private String ModalidadD;
	private String Pais;
	private Float Descuento;
	private String CursoD;
	private Date FechaFinal;
	private int cursoID;
	
	
	public Descuentos() {
		
	}

	public Descuentos(int idDescuentos, String nombredescuento, String modalidadD, String pais, Float descuento,
			String cursoD, Date fechaFinal, int cursoID) {
		super();
		this.idDescuentos = idDescuentos;
		Nombredescuento = nombredescuento;
		ModalidadD = modalidadD;
		Pais = pais;
		Descuento = descuento;
		CursoD = cursoD;
		FechaFinal = fechaFinal;
		this.cursoID = cursoID;
	}

	public int getIdDescuentos() {
		return idDescuentos;
	}

	public void setIdDescuentos(int idDescuentos) {
		this.idDescuentos = idDescuentos;
	}

	public String getNombredescuento() {
		return Nombredescuento;
	}

	public void setNombredescuento(String nombredescuento) {
		Nombredescuento = nombredescuento;
	}

	public String getModalidadD() {
		return ModalidadD;
	}

	public void setModalidadD(String modalidadD) {
		ModalidadD = modalidadD;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public Float getDescuento() {
		return Descuento;
	}

	public void setDescuento(Float descuento) {
		Descuento = descuento;
	}

	public String getCursoD() {
		return CursoD;
	}

	public void setCursoD(String cursoD) {
		CursoD = cursoD;
	}

	public Date getFechaFinal() {
		return FechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		FechaFinal = fechaFinal;
	}

	public int getCursoID() {
		return cursoID;
	}

	public void setCursoID(int cursoID) {
		this.cursoID = cursoID;
	}
	
	
	
}
