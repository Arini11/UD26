package me.arnaumas.ud26ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud26ex3.dao.IVentaDAO;
import me.arnaumas.ud26ex3.dto.Venta;

@Service
public class VentaServiceIMPL implements IVentaService{

	@Autowired
	IVentaDAO iVentasDAO;
	public List<Venta> listarVentas() {
		return iVentasDAO.findAll();
	}

	public Venta guardarVentas(Venta venta) {
		return iVentasDAO.save(venta);
	}

	public Venta VentasXID(int Codigo) {
		return iVentasDAO.findById(Codigo).get();
	}

	public Venta actualizarVentas(Venta venta) {
		return iVentasDAO.save(venta);
	}

	public void eliminarVentas(int Codigo) {
		iVentasDAO.deleteById(Codigo);
	}

}