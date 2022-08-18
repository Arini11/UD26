package me.arnaumas.ud26ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.arnaumas.ud26ex3.dto.Productos;
import me.arnaumas.ud26ex3.service.ProductosServiceIMPL;

@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	ProductosServiceIMPL productosServiceImpl;

	@GetMapping("/productos")
	public List<Productos> listarProductoss() {
		return productosServiceImpl.listarProductos();
	}

	@PostMapping("/productos")
	public Productos salvarProductos(@RequestBody Productos Productos) {

		return productosServiceImpl.guardarProductos(Productos);
	}

	@GetMapping("/productos/{id}")
	public Productos ProductosXID(@PathVariable(name = "id") int id) {

		Productos Productos_xid = new Productos();

		Productos_xid = productosServiceImpl.ProductosXID(id);

		System.out.println("Productos XID: " + Productos_xid);

		return Productos_xid;
	}

	@PutMapping("/productos/{id}")
	public Productos actualizarProductos(@PathVariable(name = "id") int id, @RequestBody Productos Productos) {

		Productos Productos_seleccionado = new Productos();
		Productos Productos_actualizado = new Productos();

		Productos_seleccionado = productosServiceImpl.ProductosXID(id);

		Productos_seleccionado.setId(Productos.getId());
		Productos_seleccionado.setNombre(Productos.getNombre());
		Productos_seleccionado.setPrecio(Productos.getPrecio());

		Productos_actualizado = productosServiceImpl.actualizarProductos(Productos_seleccionado);

		System.out.println("El Productos actualizado es: " + Productos_actualizado);

		return Productos_actualizado;
	}

	@DeleteMapping("/productos/{id}")
	public void eliminarProductos(@PathVariable(name = "id") int id) {
		productosServiceImpl.eliminarProductos(id);
	}
}
