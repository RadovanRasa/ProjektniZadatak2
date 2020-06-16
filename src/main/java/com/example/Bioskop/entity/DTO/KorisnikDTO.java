package com.example.Bioskop.entity.DTO;

import java.util.Date;

import javax.persistence.Column;
enum Uloge{GLEDALAC, ADMINISTRATOR, MENADZER}


public class KorisnikDTO {
	protected String k_ime;
	protected String lozinka;
	protected String ime;
	protected String prezime;
	protected String telefon;
	protected String email;
	protected Uloge uloga;
	protected Date datum_rodjenja;
	protected Boolean aktivan;
	


	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public Uloge getUloga() {
		return uloga;
	}

	public void setUloga(Uloge uloga) {
		this.uloga = uloga;
	}

		
	public KorisnikDTO() {
		
	};
	public KorisnikDTO(String k_ime, String lozinka, String ime, String prezime, String telefon, String email,
			 Date datum_rodjenja,Uloge uloga) {
		super();
		this.k_ime = k_ime;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.email = email;
		this.uloga = uloga;
		this.datum_rodjenja = datum_rodjenja;
	}

	public String getK_ime() {
		return k_ime;
	}

	public void setK_ime(String k_ime) {
		this.k_ime = k_ime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public Boolean getAktivan() {
		return aktivan;
	}

	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
	}
	
	
}
