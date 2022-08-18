package me.arnaumas.ud26ex3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.arnaumas.ud26ex3.dto.Cajeros;
import me.arnaumas.ud26ex3.service.CajerosServiceIMPL;

@RestController
@RequestMapping("/api")
public class CajerosController {
	
		@Autowired
		CajerosServiceIMPL cajerosServiceImpl;

		@GetMapping("/cajeros")
		public List<Cajeros> listarCajeross() {
			return cajerosServiceImpl.listarCajeros();
		}

		@PostMapping("/cajeros")
		public Cajeros salvarCajeros(@RequestBody Cajeros Cajeros) {

			return cajerosServiceImpl.guardarCajeros(Cajeros);
		}

		@GetMapping("/cajeros/{id}")
		public Cajeros CajerosXID(@PathVariable(name = "id") int id) {

			Cajeros Cajeros_xid = new Cajeros();

			Cajeros_xid = cajerosServiceImpl.CajerosXID(id);

			System.out.println("Cajeros XID: " + Cajeros_xid);

			return Cajeros_xid;
		}

		@PutMapping("/cajeros/{id}")
		public Cajeros actualizarCajeros(@PathVariable(name = "id") int id, @RequestBody Cajeros Cajeros) {

			Cajeros Cajeros_seleccionado = new Cajeros();
			Cajeros Cajeros_actualizado = new Cajeros();

			Cajeros_seleccionado = cajerosServiceImpl.CajerosXID(id);

			Cajeros_seleccionado.setId(Cajeros.getId());
			Cajeros_seleccionado.setNomApels(Cajeros.getNomApels());

			Cajeros_actualizado = cajerosServiceImpl.actualizarCajeros(Cajeros_seleccionado);

			System.out.println("El Cajeros actualizado es: " + Cajeros_actualizado);

			return Cajeros_actualizado;
		}

		@DeleteMapping("/cajeros/{id}")
		public void eliminarCajeros(@PathVariable(name = "id") int id) {
			cajerosServiceImpl.eliminarCajeros(id);
		}
	}
