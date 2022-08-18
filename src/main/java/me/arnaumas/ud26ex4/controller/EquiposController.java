package me.arnaumas.ud26ex4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.arnaumas.ud26ex4.dto.Equipo;
import me.arnaumas.ud26ex4.service.EquiposServiceIMPL;

@RestController
@RequestMapping("/api")
public class EquiposController {

	@Autowired
	EquiposServiceIMPL EquiposServiceImpl;
	
	@GetMapping("/equipos")
	public List<Equipo> listarCEquipos(){
		return EquiposServiceImpl.listarEquipos();
	}
	
	
	@PostMapping("/equipos")
	public Equipo salvarEquipos(@RequestBody Equipo Equipos) {
		
		return EquiposServiceImpl.guardarEquipos(Equipos);
	}
	
	
	@GetMapping("/equipos/{id}")
	public Equipo EquiposXID(@PathVariable(name="id") int id) {
		
		Equipo Equipos_xid= new Equipo();
		
		Equipos_xid=EquiposServiceImpl.EquiposXID(id);
		
		System.out.println("Equipos XID: "+Equipos_xid);
		
		return Equipos_xid;
	}
	
	@PutMapping("/equipos/{id}")
	public Equipo actualizarEquipos(@PathVariable(name="id")int id,@RequestBody Equipo Equipos) {
		
		Equipo Equipos_seleccionado= new Equipo();
		Equipo Equipos_actualizado= new Equipo();
		
		Equipos_seleccionado= EquiposServiceImpl.EquiposXID(id);
		
		Equipos_seleccionado.setNumSerie(Equipos.getNumSerie());
		Equipos_seleccionado.setNombre(Equipos.getNombre());
		Equipos_seleccionado.setFacultad(Equipos.getFacultad());
		
		Equipos_actualizado = EquiposServiceImpl.actualizarEquipos(Equipos_seleccionado);
		
		System.out.println("El Equipos actualizado es: "+ Equipos_actualizado);
		
		return Equipos_actualizado;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void eleiminarEquipos(@PathVariable(name="id")int id) {
		EquiposServiceImpl.eliminarEquipos(id);
	}
	
}
