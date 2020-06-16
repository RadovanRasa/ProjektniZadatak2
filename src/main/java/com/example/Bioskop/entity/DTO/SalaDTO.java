package com.example.Bioskop.entity.DTO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.Bioskop.entity.Bioskop;
import com.example.Bioskop.entity.Projekcija;

public class SalaDTO {
	private String oznaka_sale;
	private int kapacitet;
	Set<Projekcija> lista_projekcija = new HashSet<Projekcija>();
	private Bioskop bioskop;
	public SalaDTO(String oznaka_sale, int kapacitet, Set<Projekcija> lista_projekcija, Bioskop bioskop) {
		this.oznaka_sale = oznaka_sale;
		this.kapacitet = kapacitet;
		this.lista_projekcija = lista_projekcija;
		this.bioskop = bioskop;
	}
	public SalaDTO(String oznaka_sale, int kapacitet) {
		this.oznaka_sale = oznaka_sale;
		this.kapacitet = kapacitet;
	}
	public String getOznaka_sale() {
		return oznaka_sale;
	}
	public void setOznaka_sale(String oznaka_sale) {
		this.oznaka_sale = oznaka_sale;
	}
	public int getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	public Set<Projekcija> getLista_projekcija() {
		return lista_projekcija;
	}
	public void setLista_projekcija(Set<Projekcija> lista_projekcija) {
		this.lista_projekcija = lista_projekcija;
	}
	public Bioskop getBioskop() {
		return bioskop;
	}
	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	} 
	
	
	
}






