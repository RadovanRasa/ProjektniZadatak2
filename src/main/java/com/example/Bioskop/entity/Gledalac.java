package com.example.Bioskop.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("Gledalac")
public class Gledalac extends Korisnik {
	
	@OneToMany(mappedBy = "gledalac")
	private Set<Ocena> ocena = new HashSet<Ocena>();
	
	@ManyToMany
	@JoinTable (name = "Rezervisane_Projekcije", 
	joinColumns = @JoinColumn(name = "gledalac_id"),
	inverseJoinColumns = @JoinColumn(name = "rezervisana_projekcija"))
	private Set<Projekcija> rezervisana_projekcija = new HashSet<Projekcija>();
	
	@ManyToOne
	private Bioskop bioskop;
	
	public Gledalac(String k_ime, String lozinka, String ime, String prezime, String telefon, String email, Date datum_rodjenja,
			Uloge uloga, Boolean aktivan) {
		super(k_ime, lozinka, ime, prezime, telefon, email, datum_rodjenja, uloga, aktivan);
		this.bioskop = bioskop;
		this.ocena=ocena;
		this.rezervisana_projekcija=rezervisana_projekcija;
		this.uloga=uloga.GLEDALAC;
		
	}
	
}
