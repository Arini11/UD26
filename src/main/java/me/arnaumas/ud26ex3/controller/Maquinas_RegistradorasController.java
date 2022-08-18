package me.arnaumas.ud26ex3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.arnaumas.ud26ex3.dto.Maquinas_Registradoras;
import me.arnaumas.ud26ex3.service.Maquinas_RegistradorasServiceIMPL;

@RestController
@RequestMapping("/api")
public class Maquinas_RegistradorasController {

	@Autowired
	Maquinas_RegistradorasServiceIMPL maquinas_RegistradorasServiceImpl;

	@GetMapping("/maquinasRegistradoras")
	public List<Maquinas_Registradoras> listarMaquinas_Registradorass() {
		return maquinas_RegistradorasServiceImpl.listarMaquinas_Registradoras();
	}

	@PostMapping("/maquinasRegistradoras")
	public Maquinas_Registradoras salvarMaquinas_Registradoras(@RequestBody Maquinas_Registradoras Maquinas_Registradoras) {

		return maquinas_RegistradorasServiceImpl.guardarMaquinas_Registradoras(Maquinas_Registradoras);
	}

	@GetMapping("/maquinasRegistradoras/{id}")
	public Maquinas_Registradoras Maquinas_RegistradorasXID(@PathVariable(name = "id") int id) {

		Maquinas_Registradoras Maquinas_Registradoras_xid = new Maquinas_Registradoras();

		Maquinas_Registradoras_xid = maquinas_RegistradorasServiceImpl.Maquinas_RegistradorasXID(id);

		System.out.println("Maquinas_Registradoras XID: " + Maquinas_Registradoras_xid);

		return Maquinas_Registradoras_xid;
	}

	@PutMapping("/maquinasRegistradoras/{id}")
	public Maquinas_Registradoras actualizarMaquinas_Registradoras(@PathVariable(name = "id") int id, @RequestBody Maquinas_Registradoras Maquinas_Registradoras) {

		Maquinas_Registradoras Maquinas_Registradoras_seleccionado = new Maquinas_Registradoras();
		Maquinas_Registradoras Maquinas_Registradoras_actualizado = new Maquinas_Registradoras();

		Maquinas_Registradoras_seleccionado = maquinas_RegistradorasServiceImpl.Maquinas_RegistradorasXID(id);

		Maquinas_Registradoras_seleccionado.setId(Maquinas_Registradoras.getId());
		Maquinas_Registradoras_seleccionado.setPiso(Maquinas_Registradoras.getPiso());

		Maquinas_Registradoras_actualizado = maquinas_RegistradorasServiceImpl.actualizarMaquinas_Registradoras(Maquinas_Registradoras_seleccionado);

		System.out.println("El Maquinas_Registradoras actualizado es: " + Maquinas_Registradoras_actualizado);

		return Maquinas_Registradoras_actualizado;
	}

	@DeleteMapping("/maquinasRegistradoras/{id}")
	public void eliminarMaquinas_Registradoras(@PathVariable(name = "id") int id) {
		maquinas_RegistradorasServiceImpl.eliminarMaquinas_Registradoras(id);
	}
	
}
