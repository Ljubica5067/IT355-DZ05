package org.example.controller;

import org.example.domain.Automobil;
import org.example.domain.Iznajmljivanje;
import org.example.domain.Korisnik;
import org.example.service.AutomobilService;
import org.example.service.IznajmljivanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PageController
{
    @Autowired
    private AutomobilService autoService;
    @Autowired
    private IznajmljivanjeService iznmService;

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("automobili", autoService.getAll());
        modelAndView.setViewName("homepage");
        return modelAndView;
    }

    @PostMapping("/add")
    public String add(@RequestParam String marka,
                      @RequestParam String model, @RequestParam int godProizvodnje,
                      @RequestParam String ime, @RequestParam String prezime,
                      @RequestParam String kontakt) {
        Automobil auto = new Automobil(marka, model, godProizvodnje);
        Korisnik korisnik = new Korisnik(ime, prezime, kontakt);
        Iznajmljivanje iznajmljivanje = new Iznajmljivanje(auto, korisnik);
        iznmService.add(iznajmljivanje);
        return "redirect:/";
    }

    @PostMapping("/remove")
    public String remove(@RequestParam int id) {
        iznmService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("iznajmljivanje", iznmService.getAll());
        return "show";
    }

}
