package com.example.Bioskop.entity;

import java.io.Serializable;

import javax.persistence.*;
import java.util.Date;
import static java.lang.Boolean.FALSE;

enum Uloge{GLEDALAC, ADMINISTRATOR, MENADZER}

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Korisnik implements Serializable {
	
	@Id
	@Column(name="k_ime")
	protected String k_ime;
	
	@Column(nullable=false)
	protected String lozinka;
	
	@Column
	protected String ime;
	
	@Column
	protected String prezime;
	
	@Column
	protected String telefon;
	
	@Column
	protected String email;
	
	@Column
	protected Date datum_rodjenja;
	
	@Column
	protected Uloge uloga;
	
	@Column
	protected Boolean aktivan;
	
	public Korisnik(String k_ime, String lozinka, String ime, String prezime, String telefon, String email, Date datum_rodjenja,
			Uloge uloga, Boolean aktivan) {
		this.k_ime = k_ime;
		this.lozinka=lozinka;
		this.ime=ime;
		this.prezime=prezime;
		this.telefon=telefon;
		this.email=email;
		this.datum_rodjenja=datum_rodjenja;
		this.uloga=uloga;
		this.aktivan=aktivan;
		
	}
	
	
	public String getK_ime() {
		return k_ime;
	}

	public void setK_ime(String k_ime) {
		this.k_ime = k_ime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
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
		this.email =email;
	}

	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public Uloge getUloga() {
		return uloga;
	}

	public void setUloga(Uloge uloga) {
		this.uloga = uloga;
	}

	public Boolean getAktivan() {
		return aktivan;
	}

	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
	}

	@Override
	public String toString() {
		return "Korisnik [k_ime=" + k_ime + ", ime=" + ime + ", prezime=" + prezime + ", telefon=" + telefon
				+ ", Email=" + email + ", datum_rodjenja=" + datum_rodjenja + ", uloga=" + uloga + ", aktivan="
				+ aktivan + "]";
	}
	
	
	
}
