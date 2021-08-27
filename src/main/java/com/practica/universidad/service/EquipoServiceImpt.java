package com.practica.universidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.universidad.model.Equipo;
import com.practica.universidad.repository.EquipoRepository;
@Service
public class EquipoServiceImpt implements EquipoService {

	@Autowired
	private EquipoRepository repo;
	
	@Override
	public List<Equipo> listarEquipos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
