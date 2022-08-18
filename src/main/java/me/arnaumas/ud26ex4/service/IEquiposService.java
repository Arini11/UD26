package me.arnaumas.ud26ex4.service;

import java.util.List;

import me.arnaumas.ud26ex4.dto.Equipo;

public interface IEquiposService {

	public List<Equipo> listarEquipos(); 
	
	public Equipo guardarEquipos(Equipo Equipos);	
	
	public Equipo EquiposXID(int id);
	
	public Equipo actualizarEquipos(Equipo Equipos); 
	
	public void eliminarEquipos(int id);
	
}
