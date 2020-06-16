/*package com.example.Bioskop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Bioskop.entity.DTO.KorisnikDTO;
import com.example.Bioskop.entity.Gledalac;
import com.example.Bioskop.entity.Korisnik;
import com.example.Bioskop.entity.Menadzer;
import com.example.Bioskop.repository.KorisnikRepository;
enum Uloge{GLEDALAC, ADMINISTRATOR, MENADZER}

public class KorisnikServiceImpl implements KorisnikService {
	@Autowired
    private KorisnikRepository korisnikRepository;
    @Override
    public KorisnikDTO dodajKorisnika(KorisnikDTO dto) {
        //provera da li vec prostojji korisnik sa tim korisnickim imenom
        Korisnik pronadjenKorisnik= korisnikRepository.findByKorisnickoIme(dto.getK_ime());
        if (pronadjenKorisnik!= null){
            return null;
        }
        
        if(dto.getUloga()== Uloge.GLEDALAC{
            Gledalac gledalac = new Gledalac(dto.getK_ime(), dto.getLozinka(),dto.getIme(),
                    dto.getPrezime(),
                    dto.getTelefon(), dto.getEmail(), dto.getDatum_rodjenja(), dto.getUloga(),true);
            korisnikRepository.save(gledalac);
        }else if(dto.getUloga()==Uloge.GLEDALAC){
            Menadzer menadzer = new Menadzer(dto.getK_ime(), dto.getLozinka(), dto.getIme(), dto.getPrezime(),
                    dto.getTelefon(), dto.getTelefon(), dto.getDatum_rodjenja(), dto.getUloga(),
                    false);
            korisnikRepository.save(menadzer);
        }
        return dto;



    }

    @Override
    public KorisnikDTO prijavaKorisnika(String korisnickoIme, String lozinka, boolean aktivan){

        Korisnik postojiKorisnik=korisnikRepository.findByKorisnickoImeAndLozinkaAndAktivan(korisnickoIme,lozinka,aktivan);
        if(postojiKorisnik==null){
            return null;
        }

        KorisnikDTO korisnik=new KorisnikDTO(postojiKorisnik.getK_ime(),postojiKorisnik.getLozinka(),
                                             postojiKorisnik.getIme(),
                                             postojiKorisnik.getPrezime(),postojiKorisnik.getTelefon(),
                                             postojiKorisnik.getEmail(),postojiKorisnik.getDatum_rodjenja(),
                                             postojiKorisnik.getUloga());

        return korisnik;
    }

    public KorisnikDTO pregledProfila(String korisnickoIme){
        Korisnik postojiKorisnik=korisnikRepository.findByKorisnickoIme(korisnickoIme);
        if(postojiKorisnik==null){
            return null;
        }

        KorisnikDTO korisnik=new KorisnikDTO(postojiKorisnik.getK_ime(),postojiKorisnik.getLozinka(),
                postojiKorisnik.getIme(),
                postojiKorisnik.getPrezime(),postojiKorisnik.getTelefon(),
                postojiKorisnik.getEmail(),postojiKorisnik.getDatum_rodjenja(),
                postojiKorisnik.getUloga());

        return korisnik;
    }


}*/
