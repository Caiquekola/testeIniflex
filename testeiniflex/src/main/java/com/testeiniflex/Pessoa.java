package com.testeiniflex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getNome(){
        return this.nome; //3.2 ; 3.3
    }

    public String getDataNascimentoFormatada(){
        return this.dataNascimento.format(dataFormatada); //3.3
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

}
