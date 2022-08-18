package me.arnaumas.ud26ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud26ex2.dao.IAsignado_aDAO;
import me.arnaumas.ud26ex2.dto.Asignado_a;
@Service
public class Asignado_aServiceIMPL implements IAsignado_aService {
	
	@Autowired
	IAsignado_aDAO iAsignado_aDAO;
	@Override
	public List<Asignado_a> listarAsignados() {
		return iAsignado_aDAO.findAll();
	}

	@Override
	public Asignado_a guardarAsignado(Asignado_a asignado_a) {
		return iAsignado_aDAO.save(asignado_a);
	}

	@Override
	public Asignado_a asignadoXID(int id) {
		return iAsignado_aDAO.findById(id).get();
	}

	@Override
	public Asignado_a actualizarAsignado(Asignado_a asignado_a) {
		return iAsignado_aDAO.save(asignado_a);
	}

	@Override
	public void eliminarAsignado(int id) {
		iAsignado_aDAO.deleteById(id);
		
	}

}
