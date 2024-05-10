package com.example.gtics_lab6_20201497.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Tecnicos")
public class TecnicoController {
    @GetMapping("")
    public String verListadoTecnicos(Model model) {
        return "Tecnicos/lista";
    }
}
