package com.example.Bioskop.entity.DTO;

public class PrijavaDTO {
	private String k_ime;
	private String lozinka;
	
	public PrijavaDTO(String k_ime, String lozinka) {
		this.k_ime = k_ime;
		this.lozinka = lozinka;
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
	
	
	
	
}
