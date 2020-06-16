package com.example.Bioskop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Ocena implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "gledalac")
	private Gledalac gledalac;
	
	@ManyToOne
	@JoinColumn(name = "film")
	private Film film;
	
	@Column
	private int ocena;
	
	public Ocena(Long id, Gledalac gledalac, Film film, int ocena) {
		this.id = id;
		this.gledalac = gledalac;
		this.film=film;
		this.ocena=ocena;
		film.izracunajProsecnu(this);
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	
}
