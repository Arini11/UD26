package me.arnaumas.ud26ex4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="investigadores")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Investigador {

	@Id	
	private @Getter @Setter String dni;
	private @Getter @Setter String nomApels;
	
	@Exclude @ManyToOne @JoinColumn(name = "id_facultad")
	private @Getter @Setter Facultad facultad;
	
	@Exclude @JsonIgnore @OneToMany(fetch = FetchType.LAZY, mappedBy = "investigadores")
	private @Getter @Setter List<Reserva> reserva;	
}
