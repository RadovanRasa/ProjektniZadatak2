package com.example.Bioskop.controller;

import com.example.Bioskop.entity.DTO.KorisnikDTO;
import com.example.Bioskop.entity.DTO.PrijavaDTO;
import com.example.Bioskop.entity.Korisnik;
import com.example.Bioskop.service.KorisnikService;
//import com.example.Bioskop.service.KorisnikServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
public class KorisnikController {
    @Autowired
    private KorisnikService korisnikService;

    @GetMapping("/")
    public String welcome() {
        return "index.html";
    }

    //dodavanje
    @PostMapping(value = "/dodajKorisnika",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<KorisnikDTO> dodajKorisnika(@RequestBody KorisnikDTO korisnikDTO){
    KorisnikDTO rezultat= korisnikService.dodajKorisnika(korisnikDTO);
    if(rezultat==null){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }else{
        return new ResponseEntity<>(rezultat,HttpStatus.OK);

    }
    }
    @GetMapping("/dodajKorisnika")
    public String dodajKorisnika(Model model){
        KorisnikDTO korisnik=new KorisnikDTO();
        model.addAttribute("korisnik",korisnik);
    return "reg.html";
    }

    //prijava
    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<KorisnikDTO> prijavaKorisnika(@RequestBody PrijavaDTO korisnik) {
        KorisnikDTO dto = korisnikService.prijavaKorisnika(korisnik.getK_ime(), korisnik.getLozinka(), true);
        if(dto == null) {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }
    }
    @GetMapping("/login")
    public String prijavaKorisnika(Model model){
        KorisnikDTO korisnik=new KorisnikDTO();
        model.addAttribute("korisnik",korisnik);
        return "login.html";
    }


    @GetMapping(value = "/korisnik/{korisnickoIme}", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<KorisnikDTO> getUser(@PathVariable String korisnickoIme) {
        KorisnikDTO dto = korisnikService.pregledProfila(korisnickoIme);
        if(dto == null) {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(dto, HttpStatus.OK);
    }



}
