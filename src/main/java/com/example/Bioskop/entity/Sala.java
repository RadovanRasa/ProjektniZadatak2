package com.example.Bioskop.entity;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sala implements Serializable {
	
	@Id
	@Column(name="oznaka_sale")
	private String oznaka_sale;
	
	@Column
	private int kapacitet;
	
	@OneToMany(mappedBy = "sala")
	Set<Projekcija> lista_projekcija = new HashSet<Projekcija>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Bioskop bioskop; 
	
	public Sala(String oznaka_sale, int kapacitet, Set<Projekcija> lista_projekcija, Bioskop bioksop) {
		this.oznaka_sale = oznaka_sale;
		this.kapacitet=kapacitet;
		this.lista_projekcija=lista_projekcija;
		this.bioskop=bioskop;
	}
	
	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public String getOznaka_sale() {
		return oznaka_sale;
	}

	public void setOznaka_sale(String oznaka_sale) {
		this.oznaka_sale = oznaka_sale;
	}

	@Override
	public String toString() {
		return "Sala [kapacitet=" + kapacitet + ", oznaka_sale=" + oznaka_sale + "]";
	}
	
	
}
