package me.arnaumas.ud26ex3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.arnaumas.ud26ex3.dto.Venta;
import me.arnaumas.ud26ex3.service.VentaServiceIMPL;


@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceIMPL ventaServiceImpl;

	@GetMapping("/ventas")
	public List<Venta> listarVentas() {
		return ventaServiceImpl.listarVentas();
	}

	@PostMapping("/ventas")
	public Venta salvarVentas(@RequestBody Venta venta) {

		return ventaServiceImpl.guardarVentas(venta);
	}

	@GetMapping("/ventas/{id}")
	public Venta ventasXID(@PathVariable(name = "id") int id) {

		Venta Ventas_xid = new Venta();

		Ventas_xid = ventaServiceImpl.VentasXID(id);

		System.out.println("Ventas XID: " + Ventas_xid);

		return Ventas_xid;
	}

	@PutMapping("/ventas/{id}")
	public Venta actualizarVentas(@PathVariable(name = "id") int id, @RequestBody Venta Ventas) {

		Venta Ventas_seleccionado = new Venta();
		Venta Ventas_actualizado = new Venta();

		Ventas_seleccionado = ventaServiceImpl.VentasXID(id);

		Ventas_seleccionado.setCajero(Ventas.getCajero());
		Ventas_seleccionado.setMaquina_Registradora(Ventas.getMaquina_Registradora());
		Ventas_seleccionado.setProducto(Ventas.getProducto());

		Ventas_actualizado = ventaServiceImpl.actualizarVentas(Ventas_seleccionado);

		System.out.println("El Ventas actualizado es: " + Ventas_actualizado);

		return Ventas_actualizado;
	}

	@DeleteMapping("/ventas/{id}")
	public void eliminarVentas(@PathVariable(name = "id") int id) {
		ventaServiceImpl.eliminarVentas(id);
	}
	
}
