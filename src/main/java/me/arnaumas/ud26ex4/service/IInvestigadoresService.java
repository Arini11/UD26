package me.arnaumas.ud26ex4.service;

import java.util.List;

import me.arnaumas.ud26ex4.dto.Investigador;

public interface IInvestigadoresService {

	public List<Investigador> listarInvestigadores(); 
	
	public Investigador guardarInvestigadores(Investigador Investigadores);	
	
	public Investigador InvestigadoresXID(int id);
	
	public Investigador actualizarInvestigadores(Investigador Investigadores); 
	
	public void eliminarInvestigadores(int id);
	
}
