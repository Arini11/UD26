package me.arnaumas.ud26ex3.dto;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString.Exclude;

@Entity
@Table(name="venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	
	@Exclude @ManyToOne @JoinColumn(name = "id_cajero")
	private @Getter @Setter Cajeros cajero;
	
	@Exclude @ManyToOne @JoinColumn(name = "id_maquina")
	private @Getter @Setter Maquinas_Registradoras maquina_Registradora;
	
	@Exclude @ManyToOne @JoinColumn(name = "id_producto")
	private @Getter @Setter Productos producto;
}
