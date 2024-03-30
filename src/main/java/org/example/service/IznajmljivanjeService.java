package org.example.service;

import org.example.domain.Iznajmljivanje;

import java.util.List;

public interface IznajmljivanjeService
{
    List<Iznajmljivanje> getAll();

    void add(Iznajmljivanje iz);

    void remove(int id);
}
