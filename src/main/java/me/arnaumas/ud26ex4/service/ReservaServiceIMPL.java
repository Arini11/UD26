package me.arnaumas.ud26ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud26ex4.dao.IReservaDAO;
import me.arnaumas.ud26ex4.dto.Reserva;

@Service
public class ReservaServiceIMPL implements IReservaService {

	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReservas() {
		// TODO Auto-generated method stub
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva Reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(Reserva);
	}

	@Override
	public Reserva ReservaXID(int id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva Reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(Reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		// TODO Auto-generated method stub
		iReservaDAO.deleteById(id);
	}
	
}
