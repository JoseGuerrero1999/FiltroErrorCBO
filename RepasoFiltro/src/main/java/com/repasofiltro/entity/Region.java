package com.repasofiltro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "tb_Region")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int idregion ;
	private String pais;
}
