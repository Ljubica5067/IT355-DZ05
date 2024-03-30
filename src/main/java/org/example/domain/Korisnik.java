package org.example.domain;

public class Korisnik
{
    private String ime;
    private String prezime;
    private String kontakt;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, String kontakt) {
        this.ime = ime;
        this.prezime = prezime;
        this.kontakt = kontakt;
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

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }
}
