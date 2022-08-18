package me.arnaumas.ud26ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud26ex4.dao.IEquiposDAO;
import me.arnaumas.ud26ex4.dto.Equipo;

@Service
public class EquiposServiceIMPL implements IEquiposService {

	@Autowired
	IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipo> listarEquipos() {
		// TODO Auto-generated method stub
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipo guardarEquipos(Equipo Equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(Equipos);
	}

	@Override
	public Equipo EquiposXID(int id) {
		// TODO Auto-generated method stub
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipo actualizarEquipos(Equipo Equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(Equipos);
	}

	@Override
	public void eliminarEquipos(int id) {
		// TODO Auto-generated method stub
		iEquiposDAO.deleteById(id);
	}

}
