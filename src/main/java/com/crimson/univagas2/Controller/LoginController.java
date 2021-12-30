package com.crimson.univagas2.Controller;

import com.crimson.univagas2.Model.Empresa;
import com.crimson.univagas2.Model.Vaga;
import com.crimson.univagas2.Repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {
    @PostMapping
    public String form(Vaga vaga){
        return "redirect:/home";
    }
    @GetMapping
    public String a(Vaga vaga){
        return "login";
    }
}
