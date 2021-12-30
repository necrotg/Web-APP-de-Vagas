package com.crimson.univagas2.Controller;

import com.crimson.univagas2.Model.Vaga;
import com.crimson.univagas2.Repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private VagaRepository vr;

    @GetMapping
    public ModelAndView listaVagas(){
        ModelAndView mv = new ModelAndView("home");
        Iterable<Vaga> vagas = vr.findAll();
        mv.addObject("vagas",vagas);
        return mv;
    }
    @GetMapping(value="/{id}")
    public ModelAndView detalhesVaga(@PathVariable("id") long id){
        Vaga vaga = vr.findByid(id);
        ModelAndView mv = new ModelAndView("detalhes");
        mv.addObject("vaga", vaga);
        return mv;
    }

    @PostMapping
    public String form(Vaga vaga){
        vr.save(vaga);
        return "redirect:/home";
    }
}
