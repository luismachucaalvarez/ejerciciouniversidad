package com.practica.universidad.service;

import java.util.List;

import com.practica.universidad.model.Investigadore;

public interface InvestigadorService {

	List<Investigadore> listarInvestigadores();
	void agregar(Investigadore investigador);
	void modificar(Investigadore investigador);
	Investigadore listarInvestigadorPorModificar(Integer id);
	void eliminar(Integer id);
 
}
