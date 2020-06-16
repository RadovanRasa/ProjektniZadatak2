package com.example.Bioskop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Projekcija implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne 
	@JoinColumn(name ="FILM")
	private Film film;
	
	@ManyToMany(mappedBy = "rezervisana_projekcija")
	private Set<Gledalac> lista_rezervacija = new HashSet<Gledalac>();
	
	@ManyToOne
	@JoinColumn(name = "SALA")
	private Sala sala;
	
	@Column
	private Date dan;
	
	@Column
	private double cena;
	
	@Column
	private int broj_rezervisanih_karata;

	public Projekcija (Long id, Film film, Sala sala, Date dan, double cena, int broj_rezervisanih_karata) {
		this.id = id;
		this.film = film;
		this.sala = sala;
		this.dan=dan;
		this.cena = cena;
		this.broj_rezervisanih_karata=broj_rezervisanih_karata;
	}
	public Date getDan() {
		return dan;
	}

	public void setDan(Date dan) {
		this.dan = dan;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Projekcija [dan=" + dan + ", cena=" + cena + "]";
	}
	
	
}
