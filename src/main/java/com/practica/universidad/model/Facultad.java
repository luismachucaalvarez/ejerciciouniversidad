package com.practica.universidad.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the facultad database table.
 * 
 */
@Entity
@Table(name="facultad")
@NamedQuery(name="Facultad.findAll", query="SELECT f FROM Facultad f")
public class Facultad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String nombre;

	//bi-directional many-to-one association to Equipo
	@OneToMany(mappedBy="facultad")
	private List<Equipo> equipos;

	//bi-directional many-to-one association to Investigadore
	@OneToMany(mappedBy="facultad")
	private List<Investigadore> investigadores;

	public Facultad() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Equipo> getEquipos() {
		return this.equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public Equipo addEquipo(Equipo equipo) {
		getEquipos().add(equipo);
		equipo.setFacultad(this);

		return equipo;
	}

	public Equipo removeEquipo(Equipo equipo) {
		getEquipos().remove(equipo);
		equipo.setFacultad(null);

		return equipo;
	}

	public List<Investigadore> getInvestigadores() {
		return this.investigadores;
	}

	public void setInvestigadores(List<Investigadore> investigadores) {
		this.investigadores = investigadores;
	}

	public Investigadore addInvestigadore(Investigadore investigadore) {
		getInvestigadores().add(investigadore);
		investigadore.setFacultad(this);

		return investigadore;
	}

	public Investigadore removeInvestigadore(Investigadore investigadore) {
		getInvestigadores().remove(investigadore);
		investigadore.setFacultad(null);

		return investigadore;
	}

}