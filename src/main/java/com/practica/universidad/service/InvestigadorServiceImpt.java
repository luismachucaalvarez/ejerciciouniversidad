package com.practica.universidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.universidad.model.Investigadore;
import com.practica.universidad.repository.InvestigadorRepository;
@Service
public class InvestigadorServiceImpt implements InvestigadorService {

	@Autowired
	private InvestigadorRepository repo;
	
	@Override
	public List<Investigadore> listarInvestigadores() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void agregar(Investigadore investigador) {
		repo.save(investigador);
		
	}

	@Override
	public void modificar(Investigadore investigador) {
		repo.save(investigador);
		
	}

	@Override
	public Investigadore listarInvestigadorPorModificar(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
