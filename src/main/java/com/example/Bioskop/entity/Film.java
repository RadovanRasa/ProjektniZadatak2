package com.example.Bioskop.entity;

import java.io.Serializable;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Film implements Serializable {
	
	@Id
	@Column(name="naziv")
	private String naziv;
	
	@Column
	private String opis;
	
	@Column
	private String zanr;
	
	@Column
	private int trajanje_min;
	
	@Column(name = "prosecna_ocena")
	private double prosecna_ocena;
	
	@OneToMany(mappedBy = "film")
	private Set<Ocena> ocena = new HashSet<Ocena>();
	
	@OneToMany(mappedBy = "film")
	Set<Projekcija> lista_projekcija = new HashSet<Projekcija>();
	
	
	
	public Film(String naziv, String opis, String zanr, int trajanje_min) {
		
		this.naziv=naziv;
		this.zanr=zanr;
		this.trajanje_min= trajanje_min;
		try {
			String url = "jdbc:h2:mem:testdb"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("UPDATE Film SET prosecna_ocena = " + prosecna_ocena +"WHERE naziv = "+ naziv);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void izracunajProsecnu(Ocena o) {
		ocena.add(o);
		int b=0;
		for (Ocena oc : ocena) 
		{ 
		    b+=oc.getOcena();
		}
		this.prosecna_ocena=b/ocena.size();
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	public int getTrajanje_min() {
		return trajanje_min;
	}

	public void setTrajanje_min(int trajanje_min) {
		this.trajanje_min = trajanje_min;
	}

	public double getOcena() {
		return prosecna_ocena;
	}

	@Override
	public String toString() {
		return "Film [naziv=" + naziv + ", opis=" + opis + ", zanr=" + zanr + ", trajanje_min=" + trajanje_min
				+ ", ocena=" + prosecna_ocena + "]";
	}
}
