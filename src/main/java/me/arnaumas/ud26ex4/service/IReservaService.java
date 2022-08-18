package me.arnaumas.ud26ex4.service;

import java.util.List;

import me.arnaumas.ud26ex4.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listarReservas(); 
	
	public Reserva guardarReserva(Reserva Reserva);	
	
	public Reserva ReservaXID(int id);
	
	public Reserva actualizarReserva(Reserva Reserva); 
	
	public void eliminarReserva(int id);
	
}
