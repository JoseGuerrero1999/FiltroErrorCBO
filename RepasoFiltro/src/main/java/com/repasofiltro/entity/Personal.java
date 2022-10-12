package com.repasofiltro.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name ="tb_Personal")
public class Personal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpersonal ;
	private String nombres; 
	private String apellidos; 
	private String direccion; 
	private String trabajo; 
	private String correo; 
	private String cumple;
	@ManyToOne
	@JoinColumn (name= "idregion")
	private Region region;

}
