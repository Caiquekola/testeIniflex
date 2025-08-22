package com.testeiniflex;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public void setSalario(BigDecimal novoSalario){
        this.salario = novoSalario;
    }

    public BigDecimal getSalario(){
        return this.salario;
    }

    public String getFuncao(){
        return this.funcao;
    }

    public String getSalarioFormatado(){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        return decimalFormat.format(this.salario);
    }

    @Override
    public String toString(){
        String funcionarioToString = String.format("| %-10s | %-15s | %-10s | %-13s |",this.getNome(),this.getDataNascimentoFormatada(),this.getSalarioFormatado(),this.funcao);
        return funcionarioToString;
    }
}
