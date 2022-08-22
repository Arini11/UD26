package me.arnaumas.ud26ex1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "suministra")

public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Piezas pieza;

	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedores proveedor;

	private int precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Piezas getPieza() {
		return pieza;
	}

	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Suministra(int id, Piezas pieza, Proveedores proveedor, int precio) {
		super();
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	public Suministra() {
		// TODO Auto-generated constructor stub
	}
	
	
}
