package me.arnaumas.ud26ex1.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "proveedores")

public class Proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String nombre;

	@JsonIgnore
	@OneToMany(mappedBy = "proveedor")
	private List<Suministra> suministra;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	public Proveedores(String id, String nombre, List<Suministra> suministra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	public Proveedores() {
		// TODO Auto-generated constructor stub
	}
	
	
}
