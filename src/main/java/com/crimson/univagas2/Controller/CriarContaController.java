package com.crimson.univagas2.Controller;

import com.crimson.univagas2.Model.Empresa;
import com.crimson.univagas2.Model.Vaga;
import com.crimson.univagas2.Repositories.EmpresaRepository;
import com.crimson.univagas2.Repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/criarConta")
public class CriarContaController {

    @Autowired
    private EmpresaRepository er;

    @PostMapping
    public String form(Empresa empresa){
        er.save(empresa);
        return "redirect:/login";
    }
    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String criarConta(){
        return "/criarConta";
    }
}
