package com.practica.universidad.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the investigadores database table.
 * 
 */
@Entity
@Table(name="investigadores")
@NamedQuery(name="Investigadore.findAll", query="SELECT i FROM Investigadore i")
public class Investigadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String apellido;

	@Column(nullable=false, length=1)
	private String dv;

	@Column(nullable=false, length=35)
	private String nombre;

	@Column(nullable=false, length=8)
	private String rut;

	//bi-directional many-to-one association to Facultad
	@ManyToOne
	@JoinColumn(name="facultad_id", nullable=false)
	private Facultad facultad;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="investigadore")
	private List<Reserva> reservas;

	public Investigadore() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDv() {
		return this.dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Facultad getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setInvestigadore(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setInvestigadore(null);

		return reserva;
	}

}