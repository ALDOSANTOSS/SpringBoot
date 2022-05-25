package com.aldo.springboot.controller;


import com.aldo.springboot.modelo.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @GetMapping
    public Aluno getInfo() {
        Aluno aluno = new Aluno(1L,"Aldo Santos","75988360776","aldo.santos.oliveira95@gmaiil.com", Instant.now());
        return aluno;
    }
}


