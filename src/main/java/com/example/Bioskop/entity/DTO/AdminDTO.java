package com.example.Bioskop.entity.DTO;

import com.example.Bioskop.entity.Bioskop;

public class AdminDTO {
	private Bioskop bioskop;

	public AdminDTO(Bioskop bioskop) {
		super();
		this.bioskop = bioskop;
	}

	public Bioskop getBioskop() {
		return bioskop;
	}

	public void setBioskop(Bioskop bioskop) {
		this.bioskop = bioskop;
	}
	
	
}
