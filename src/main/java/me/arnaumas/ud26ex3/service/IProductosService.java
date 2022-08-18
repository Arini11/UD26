package me.arnaumas.ud26ex3.service;

import java.util.List;

import me.arnaumas.ud26ex3.dto.Productos;

public interface IProductosService {

	public List<Productos> listarProductos();

	public Productos guardarProductos(Productos Productos);

	public Productos ProductosXID(int ID);

	public Productos actualizarProductos(Productos Productos);

	public void eliminarProductos(int ID);
}
