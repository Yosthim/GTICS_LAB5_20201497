package com.example.gtics_lab6_20201497.controller;

import com.example.gtics_lab6_20201497.entity.Technician;
import com.example.gtics_lab6_20201497.repository.TechnicianRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Tecnicos")
public class TecnicoController {

    final TechnicianRepository technicianRepository;

    public TecnicoController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    @GetMapping("")
    public String verListadoTecnicos(Model model) {
        List<Technician> listaTecnicos = technicianRepository.findAll();
        model.addAttribute("listaTecnicos", listaTecnicos);
        return "Tecnicos/lista";
    }
}
