package com.example.Bioskop.entity.DTO;

import java.util.HashSet;
import java.util.Set;



import com.example.Bioskop.entity.Bioskop;
import com.example.Bioskop.entity.Ocena;
import com.example.Bioskop.entity.Projekcija;

public class GledalacDTO {
	private Set<Ocena> ocena = new HashSet<Ocena>();
	private Set<Projekcija> rezervisana_projekcija = new HashSet<Projekcija>();
	private Bioskop bioskop;
	
	public GledalacDTO(Set<Ocena> ocena, Set<Projekcija> rezervisana_projekcija, Bioskop bioskop) {
		super();
		this.ocena = ocena;
		this.rezervisana_projekcija = rezervisana_projekcija;
		this.bioskop = bioskop;
	}
	
	public Set<Ocena> getOcena() {
		return ocena;
	}
	public void setOcena(Set<Ocena> ocena) {
		this.ocena = ocena;
	}
	public Set<Projekcija> getRezervisana_projekcija() {
		return rezervisana_projekcija;
	}
	public void setRezervisana_projekcija(Set<Projekcija> rezervisana_projekcija) {
		this.rezervisana_projekcija = rezervisana_projekcija;
	}
	public Bioskop getBioskop() {
		return bioskop;
	}
	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}
}
