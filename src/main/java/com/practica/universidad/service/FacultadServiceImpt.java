package com.practica.universidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.universidad.model.Facultad;
import com.practica.universidad.repository.FacultadRepository;

@Service
public class FacultadServiceImpt implements FacultadService {
	
	
	@Autowired
	private FacultadRepository repo;

	@Override
	public List<Facultad> listarFacultades() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void agregar(Facultad facultad) {
		repo.save(facultad);		
	}

	@Override
	public Facultad listarFacultadPorModificar(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void modificar(Facultad facultad) {
		repo.save(facultad);		

		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		// TODO Auto-generated method stub
		
	}

}
