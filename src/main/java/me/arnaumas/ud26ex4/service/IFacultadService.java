package me.arnaumas.ud26ex4.service;

import java.util.List;

import me.arnaumas.ud26ex4.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listarFacultads(); 
	
	public Facultad guardarFacultad(Facultad Facultad);	
	
	public Facultad FacultadXID(int id);
	
	public Facultad actualizarFacultad(Facultad Facultad); 
	
	public void eliminarFacultad(int id);
	
}
