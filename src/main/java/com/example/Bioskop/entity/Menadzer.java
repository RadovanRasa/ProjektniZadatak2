package com.example.Bioskop.entity;



import javax.persistence.*;
import java.util.Date;


@Entity
@DiscriminatorValue("Menadzer")
public class Menadzer extends Korisnik {
	
	@ManyToOne
	private Bioskop bioskop;
	
	public Menadzer(String k_ime, String lozinka, String ime, String prezime, String telefon, String email, Date datum_rodjenja,
			Uloge uloga, Boolean aktivan, Bioskop bioskop) {
		super(k_ime, lozinka, ime, prezime, telefon, email, datum_rodjenja, uloga, aktivan);
		this.bioskop = bioskop;
		this.uloga=uloga.MENADZER;
	}

	public Bioskop getBioskop() {
		return bioskop;
	}

	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}
	
	
}
