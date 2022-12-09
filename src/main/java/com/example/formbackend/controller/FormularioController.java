package com.example.formbackend.controller;

import com.example.formbackend.Formulario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormularioController {

    @RequestMapping(value = "/")
    public String viewform(Model model) {

        Formulario form = new Formulario();
        model.addAttribute("form", form);
        return "form";
    }


}
