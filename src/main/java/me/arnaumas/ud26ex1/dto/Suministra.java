package me.arnaumas.ud26ex1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name = "suministra")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Suministra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;

	@Exclude
	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private @Getter @Setter Piezas pieza;

	@Exclude
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private @Getter @Setter Proveedores proveedor;

	private @Getter @Setter int precio;
}
