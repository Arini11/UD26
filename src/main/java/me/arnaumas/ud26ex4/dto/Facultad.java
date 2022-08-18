package me.arnaumas.ud26ex4.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name="facultad")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Facultad {

	@Id
	private @Getter @Setter int id;

	private @Getter @Setter String nombre;
	
	@Exclude @JsonIgnore @OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	private @Getter @Setter List<Investigador> investigadores;
	
	@Exclude @JsonIgnore @OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	private @Getter @Setter List<Equipo> equipos;
	
}
