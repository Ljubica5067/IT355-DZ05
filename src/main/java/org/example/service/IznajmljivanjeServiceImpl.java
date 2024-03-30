package org.example.service;

import org.example.domain.Automobil;
import org.example.domain.Iznajmljivanje;
import org.example.domain.Korisnik;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class IznajmljivanjeServiceImpl implements IznajmljivanjeService
{
    private List<Iznajmljivanje> najamList = new ArrayList<>();

    public IznajmljivanjeServiceImpl() {
        najamList.add(new Iznajmljivanje(new Automobil("Toyota", "Corolla", 2010),new Korisnik("Marko","Markovic","nekiKontakt")));
    }

    @Override
    public List<Iznajmljivanje> getAll() {
        return najamList;
    }

    @Override
    public void add(Iznajmljivanje iz) {
        najamList.add(iz);
    }

    @Override
    public void remove(int id)
    {
        najamList.removeIf(iznm-> iznm.getId()==id);
    }

}
