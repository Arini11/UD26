package me.arnaumas.ud26ex3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud26ex3.dao.ICajerosDAO;
import me.arnaumas.ud26ex3.dto.Cajeros;

@Service
public class CajerosServiceIMPL implements ICajerosService{

	@Autowired
	ICajerosDAO iCajerosDAO;
	@Override
	public List<Cajeros> listarCajeros() {
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros Cajeros) {
		return iCajerosDAO.save(Cajeros);
	}

	@Override
	public Cajeros CajerosXID(int Codigo) {
		return iCajerosDAO.findById(Codigo).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros Cajeros) {
		return iCajerosDAO.save(Cajeros);
	}

	@Override
	public void eliminarCajeros(int Codigo) {
		iCajerosDAO.deleteById(Codigo);
	}

}
