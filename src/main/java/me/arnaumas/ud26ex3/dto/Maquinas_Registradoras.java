package me.arnaumas.ud26ex3.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name = "maquinas_registradoras")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Maquinas_Registradoras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;

	private @Getter @Setter int piso;
	
	@Exclude @JsonIgnore @OneToMany(fetch = FetchType.LAZY, mappedBy = "maquina_Registradora")
	private @Getter @Setter List<Venta> ventas;	
}
