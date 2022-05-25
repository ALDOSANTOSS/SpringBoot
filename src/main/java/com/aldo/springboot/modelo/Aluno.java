package com.aldo.springboot.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@AllArgsConstructor
@Data
public class Aluno {

    private long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;
}
