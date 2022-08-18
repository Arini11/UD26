package me.arnaumas.ud26ex2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.ud26ex2.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, String> {
	public List<Cientificos> findByDni(String nombre);
}
