package me.arnaumas.ud26ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.ud26ex3.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
