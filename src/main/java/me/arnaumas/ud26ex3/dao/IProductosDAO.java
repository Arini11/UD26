package me.arnaumas.ud26ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.ud26ex3.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
