package me.arnaumas.ud26ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.ud26ex1.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas, Long> {

}
