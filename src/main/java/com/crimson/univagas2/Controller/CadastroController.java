package com.crimson.univagas2.Controller;

import com.crimson.univagas2.Model.Vaga;
import com.crimson.univagas2.Repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {
    @Autowired
    private VagaRepository vr;

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String cadastro(){
        return "cadastro.html";
    }

    @PostMapping
    public String form(Vaga vaga){
        vr.save(vaga);
        return "redirect:/cadastro";
    }
}