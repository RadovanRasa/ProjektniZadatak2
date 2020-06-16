package com.example.Bioskop.service;

import com.example.Bioskop.entity.DTO.KorisnikDTO;

public interface KorisnikService {
    KorisnikDTO dodajKorisnika(KorisnikDTO dto);
    KorisnikDTO prijavaKorisnika(String korisnickoIme,String lozinka, boolean aktivan);
    KorisnikDTO pregledProfila(String korisnickoIme);
}
