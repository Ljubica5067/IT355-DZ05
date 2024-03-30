package org.example.service;

import org.example.domain.Automobil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AutomobilServiceImpl implements AutomobilService{

    private List<Automobil> autoList = new ArrayList<>();

    @Override
    public List<Automobil> getAll() {
        return autoList;
    }

    public AutomobilServiceImpl()
    {
        autoList.add(new Automobil("Toyota", "Corolla", 2010));
        autoList.add(new Automobil("Ford", "Mustang", 2015));
        autoList.add(new Automobil("BMW", "3 Series", 2020));
        autoList.add(new Automobil("Audi", "A4", 2018));
        autoList.add(new Automobil("Mercedes-Benz", "C-Class", 2019));
        autoList.add(new Automobil("Volkswagen", "Golf", 2017));
    }
}
