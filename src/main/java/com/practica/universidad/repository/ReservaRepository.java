package com.practica.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.universidad.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
