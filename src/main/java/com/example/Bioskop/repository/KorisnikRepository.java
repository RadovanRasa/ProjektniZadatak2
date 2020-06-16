package com.example.Bioskop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bioskop.entity.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, String> {
	
	Korisnik findByKorisnickoIme(String k_ime);

    Korisnik findByKorisnickoImeAndLozinkaAndAktivan(String k_ime, String lozinka, boolean aktivan);
}
