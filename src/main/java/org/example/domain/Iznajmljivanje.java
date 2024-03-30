package org.example.domain;

public class Iznajmljivanje {
    private static int nextId = 1;

    public Iznajmljivanje() {
    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Iznajmljivanje(Automobil auto, Korisnik korisnik) {
        this.id = nextId++;
        this.auto = auto;
        this.korisnik = korisnik;
    }

    private Automobil auto;

    private Korisnik korisnik;

    public Automobil getAuto() {
        return auto;
    }

    public void setAuto(Automobil auto) {
        this.auto = auto;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
}
