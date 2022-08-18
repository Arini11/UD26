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

import me.arnaumas.ud26ex4.dto.Investigador;
import me.arnaumas.ud26ex4.service.InvestigadoresServiceIMPL;

@RestController
@RequestMapping("/api")
public class InvestigadoresController {

	@Autowired
	InvestigadoresServiceIMPL InvestigadoresServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigador> listarCInvestigadores(){
		return InvestigadoresServiceImpl.listarInvestigadores();
	}
	
	
	@PostMapping("/investigadores")
	public Investigador salvarInvestigadores(@RequestBody Investigador Investigadores) {
		
		return InvestigadoresServiceImpl.guardarInvestigadores(Investigadores);
	}
	
	
	@GetMapping("/investigadores/{id}")
	public Investigador InvestigadoresXID(@PathVariable(name="id") int id) {
		
		Investigador Investigadores_xid= new Investigador();
		
		Investigadores_xid=InvestigadoresServiceImpl.InvestigadoresXID(id);
		
		System.out.println("Investigadores XID: "+Investigadores_xid);
		
		return Investigadores_xid;
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigador actualizarInvestigadores(@PathVariable(name="id")int id,@RequestBody Investigador Investigadores) {
		
		Investigador Investigadores_seleccionado= new Investigador();
		Investigador Investigadores_actualizado= new Investigador();
		
		Investigadores_seleccionado= InvestigadoresServiceImpl.InvestigadoresXID(id);
		
		Investigadores_seleccionado.setFacultad(Investigadores.getFacultad());
		Investigadores_seleccionado.setNomApels(Investigadores.getNomApels());
		
		Investigadores_actualizado = InvestigadoresServiceImpl.actualizarInvestigadores(Investigadores_seleccionado);
		
		System.out.println("El Investigadores actualizado es: "+ Investigadores_actualizado);
		
		return Investigadores_actualizado;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eleiminarInvestigadores(@PathVariable(name="id")int id) {
		InvestigadoresServiceImpl.eliminarInvestigadores(id);
	}
	
}
