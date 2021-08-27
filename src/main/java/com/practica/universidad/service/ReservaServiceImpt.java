package com.practica.universidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.universidad.model.Reserva;
import com.practica.universidad.repository.ReservaRepository;
@Service
public class ReservaServiceImpt implements ReservaService {

	@Autowired private ReservaRepository repo;
	
	@Override
	public List<Reserva> listarReservas() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
