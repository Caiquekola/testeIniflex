package com.testeiniflex;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.stream.Collectors;

//3
public class Main {


    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = cadastrarFuncionarios(); //3.1

        listaFuncionarios.removeIf(funcionario -> funcionario.getNome().equals("João")); //3.2

        System.out.print(imprimirFuncionarios(listaFuncionarios)); //3.3

        listaFuncionarios.stream().
            forEach(funcionario -> funcionario.setSalario(funcionario.getSalario().
            multiply(BigDecimal.valueOf(1.1)))); //3.4

        Map<String,List<Funcionario>> mapaFuncionariosPorFuncao = listaFuncionarios.stream()
            .collect(Collectors.groupingBy(f -> f.getFuncao())); //3.5

        System.out.println("-".repeat(62)+"\n"+" ".repeat(15)+"Lista de funcionários por função\n"+"-".repeat(62));

        for(Map.Entry<String, List<Funcionario>> funcionariosPorFuncao: mapaFuncionariosPorFuncao.entrySet()){ //3.6
            System.out.println(funcionariosPorFuncao.getKey()+": ");
            funcionariosPorFuncao.getValue().stream().forEach(f -> System.out.println(f));
            System.out.println();
        }

        System.out.println("-".repeat(62)+"\n"+" ".repeat(10)+"Funcionários aniversariantes mês 10 e 12\n"+"-"
            .repeat(62));

        listaFuncionarios.stream() //3.8
        .filter(f -> (f.getDataNascimento().getMonth().equals(Month.OCTOBER)  ||f.getDataNascimento().getMonth().equals(Month.DECEMBER)))
        .forEach(f -> System.out.println(f));

        System.out.println("\n"+"-".repeat(62)+"\n"+" ".repeat(20)+"Funcionários mais velho\n"+"-".repeat(62));

        Funcionario funcionarioVelho = listaFuncionarios.stream().min(Comparator.comparing(Funcionario::getDataNascimento)).get(); //3.9

        System.out.printf("%25s %s\n",funcionarioVelho.getNome(),funcionarioVelho.getDataNascimentoFormatada());
            
        System.out.println("\n"+"-".repeat(62)+"\n"+" ".repeat(12)+"Funcionários ordenados alfabeticamente\n"
            +"-".repeat(62));

        listaFuncionarios.stream().
            sorted(Comparator.comparing(Funcionario::getNome)).
            forEach(System.out::println); //3.10

        double somaSalarios = listaFuncionarios.stream().
            mapToDouble(f -> f.getSalario().
            doubleValue()).
            sum(); //3.11

        System.out.println("\n"+"-".repeat(62)+"\n"+" ".repeat(12)+"Total dos salários funcionários\n"
            +"-".repeat(62)
            +"\n"+String.format("%35s"
            , NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format(somaSalarios)).toString());


        System.out.println("\n"+"-".repeat(62)+"\n"+" ".repeat(12)+"Salários mínimos por funcionário (R$1.212,00) \n"
            +"-".repeat(62));
        //3.12
        listaFuncionarios.stream().forEach(f -> System.out.printf("| %-10s | R$%-10s | %-10s | %n",
            f.getNome(),f.getSalarioFormatado(),(int)(f.getSalario().doubleValue()/1212)));

    }

    private static List<Funcionario> cadastrarFuncionarios() { 
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), BigDecimal.valueOf(2009.44), "Operador"));
        listaFuncionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), BigDecimal.valueOf(2284.38), "Operador"));
        listaFuncionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), BigDecimal.valueOf(9836.14), "Coordenador"));
        listaFuncionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), BigDecimal.valueOf(19119.88), "Diretor"));
        listaFuncionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), BigDecimal.valueOf(2234.68), "Recepcionista"));
        listaFuncionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), BigDecimal.valueOf(1582.72), "Operador"));
        listaFuncionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), BigDecimal.valueOf(4071.84), "Contador"));
        listaFuncionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), BigDecimal.valueOf(3017.45), "Gerente"));
        listaFuncionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), BigDecimal.valueOf(1606.85), "Eletricista"));
        listaFuncionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), BigDecimal.valueOf(2799.93), "Gerente"));
        return listaFuncionarios;
    }

    private static String imprimirFuncionarios(List<Funcionario> listaFuncionarios){ 
        StringBuilder impressaoFuncionarios = new StringBuilder();
        impressaoFuncionarios.append("-".repeat(62)).append("\n\n").append(" ".repeat(20))
            .append("Lista de funcionários").append("\n\n")
            .append("-".repeat(62)).append("\n")
            .append(String.format("| %-10s | %-15s | %-10s | %-13s |%n","Nome", "Nascimento","Salario","Funcao"))
            .append("-".repeat(62)).append("\n");
        for (Funcionario funcionario : listaFuncionarios) {
            impressaoFuncionarios.append(funcionario).append("\n");
        }
        return impressaoFuncionarios.append("\n").toString();
    }

    
    
}