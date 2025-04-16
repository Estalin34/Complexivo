package com.example.spring_boot.controllers;

import com.example.spring_boot.models.Curso;
import com.example.spring_boot.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CursoController {

    @Autowired
    CursoService cursoService;


    @GetMapping("/add")
    public String getFormCurso(Model model) {
        model.addAttribute("curso", new Curso());
        return "crud";
    }


    @PostMapping("/add-to-user")
    public String addCurso(@ModelAttribute Curso curso) {
        cursoService.saveCurso(curso);
        return "redirect:/";
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", cursoService.getAllCurso());
        return "home";
    }


    @GetMapping("/curso/edit/{id}")
    public String getFormEditProduct(@PathVariable Long id, Model model) {
        Curso curso = cursoService.getCursotById(id).orElseThrow();
        model.addAttribute("curso", curso);
        return "crud";
    }


    @PostMapping("/curso/edit/{id}")
    public String editCurso(@PathVariable Long id, @ModelAttribute Curso curso) {
        curso.setId(id);
        cursoService.saveCurso(curso);
        return "redirect:/";
    }


    @PostMapping("/curso/delete/{id}")
    public String deleteCurso(@PathVariable Long id) {
        cursoService.deleteCurso(id);
        return "redirect:/";
    }
}

