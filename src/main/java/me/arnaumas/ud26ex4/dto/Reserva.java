package me.arnaumas.ud26ex4.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name="reservas")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	
	@Exclude @ManyToOne @JoinColumn(name = "id_investigador")
	private @Getter @Setter Investigador investigadores;
	
	@Exclude @ManyToOne @JoinColumn(name = "id_equipo")
	private @Getter @Setter Equipo equipos;
	
	@Temporal(TemporalType.DATE)
	private @Getter @Setter Date comienzo;
	
	@Temporal(TemporalType.DATE)
	private @Getter @Setter Date fin;
}
