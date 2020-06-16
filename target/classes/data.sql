INSERT INTO Korisnik(type, k_ime, lozinka, ime, prezime, telefon, email, datum_rodjenja, aktivan) VALUES('Gledalac','rasa', 'sifra', 'Radovan', 'Radovanovic', '060123', 'radovan.raske@gmail.com', '1997-09-04', TRUE);;
INSERT INTO Korisnik(type, k_ime, lozinka, ime, prezime, telefon, email, datum_rodjenja, aktivan) VALUES('Gledalac','pera', 'sifra', 'Pera', 'Peric', '0612221', 'pera.peki@gmail.com', '1992-11-03', TRUE);

INSERT INTO Korisnik(type, k_ime, lozinka, ime, prezime, telefon, email, datum_rodjenja, aktivan) VALUES('Menadzer','menadzer1', 'sifra', 'Glavni', 'Menadzer', '555-333', 'medzi.nar@gmail.com', '1990-01-13', TRUE);
INSERT INTO Korisnik(type, k_ime, lozinka, ime, prezime, telefon, email, datum_rodjenja, aktivan) VALUES('Menadzer','menadzer2', 'sifra', 'NeGlavni', 'Menadzer', '444-333', 'medzi.medzik@gmail.com', '1972-12-23', TRUE);

INSERT INTO Bioskop(naziv, adresa, broj_telefona_centrale, email) VALUES ('Filmomanijak', 'Trg Oslobodjenja 21', '021 334 123', 'filmo.maniak@gmail.com' );

INSERT INTO Film(naziv, opis, zanr, trajanje_min) VALUES ('Gospodar Prstenova', 'Veoma dobar film', 'Fantazija-Avantura', 170);
INSERT INTO Film(naziv, opis, zanr, trajanje_min) VALUES ('Lucky number Slevin', 'Odlican film', 'Akcija-Misterija', 110);

INSERT INTO Sala(oznaka_sale, kapacitet, bioskop_id) VALUES ('B1', 50, 1);
INSERT INTO Sala(oznaka_sale, kapacitet, bioskop_id) VALUES ('B2', 120, 1);
INSERT INTO Sala(oznaka_sale, kapacitet, bioskop_id) VALUES ('A1', 80, 1);
INSERT INTO Sala(oznaka_sale, kapacitet, bioskop_id) VALUES ('A2', 250, 1);

INSERT INTO Projekcija(film, sala, dan, cena, broj_rezervisanih_karata) VALUES ('Gospodar Prstenova', 'B1', '2020-04-03', 450, 40);
INSERT INTO Projekcija(film, sala, dan, cena, broj_rezervisanih_karata) VALUES ('Lucky number Slevin', 'A2', '2020-05-7', 999, 250);
INSERT INTO Projekcija(film, sala, dan, cena, broj_rezervisanih_karata) VALUES ('Gospodar Prstenova', 'A1', '2020-06-02', 450, 20);

INSERT INTO Ocena(gledalac, film, ocena) VALUES ('rasa', 'Gospodar Prstenova', 9);
INSERT INTO Ocena(gledalac, film, ocena) VALUES ('pera', 'Gospodar Prstenova', 8);

INSERT INTO Bioskop_Menadzeri(bioskop_id, menadzeri_k_ime) VALUES(1, 'menadzer1');

INSERT INTO REZERVISANE_PROJEKCIJE(gledalac_id, rezervisana_projekcija) VALUES ('rasa', 1);
INSERT INTO REZERVISANE_PROJEKCIJE(gledalac_id, rezervisana_projekcija) VALUES ('rasa', 2);
INSERT INTO REZERVISANE_PROJEKCIJE(gledalac_id, rezervisana_projekcija) VALUES ('pera', 1);

