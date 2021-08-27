package com.practica.universidad.service;

import java.util.List;

import com.practica.universidad.model.Facultad;

public interface FacultadService {

	List<Facultad> listarFacultades();
	Facultad listarFacultadPorModificar(Integer id);
	void agregar(Facultad facultad);
	void modificar(Facultad facultad);
	void eliminar(Integer id);
	
}
