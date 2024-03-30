package org.example.domain;

public class Automobil
{
    private String model;

    private String marka;

    private int godProizvodnje;

    public Automobil()
    {

    }

    public Automobil(String model, String marka, int godProizvodnje) {
        this.model = model;
        this.marka = marka;
        this.godProizvodnje = godProizvodnje;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodProizvodnje() {
        return godProizvodnje;
    }

    public void setGodProizvodnje(int godProizvodnje) {
        this.godProizvodnje = godProizvodnje;
    }
}
