package org.example;

import java.time.LocalDate;

public class Pessoa {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();

        LocalDate dataNasc = LocalDate.of(1984, 4, 9);



        System.out.println(dataNasc.getYear());
    }



}
