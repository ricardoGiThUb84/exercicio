package org.example;

import java.time.LocalDate;

public class Pessoa {

    public String nome;
    public String sobrenome;
    public int anoNascimento;

    public LocalDate data = LocalDate.now();



    public void mostrarMensagem(){

        int idade = data.getYear() - this.anoNascimento;

        System.out.println("Seu nome é: " + nome + " " + sobrenome + " - idade: " + idade);


    }



}
