package me.arnaumas.ud26ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.ud26ex4.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer>{

}
