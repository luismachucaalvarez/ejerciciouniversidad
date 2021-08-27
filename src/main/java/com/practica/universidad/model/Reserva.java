package com.practica.universidad.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the reservas database table.
 * 
 */
@Entity
@Table(name="reservas")
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(name="fecha_fin", nullable=false)
	private Timestamp fechaFin;

	@Column(name="fecha_inicio", nullable=false)
	private Timestamp fechaInicio;

	//bi-directional many-to-one association to Investigadore
	@ManyToOne
	@JoinColumn(name="investigador_id", nullable=false)
	private Investigadore investigadore;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="equipo_id", nullable=false)
	private Equipo equipo;

	public Reserva() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Timestamp fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Timestamp getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Investigadore getInvestigadore() {
		return this.investigadore;
	}

	public void setInvestigadore(Investigadore investigadore) {
		this.investigadore = investigadore;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}