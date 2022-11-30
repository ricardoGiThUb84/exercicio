package org.example;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome");

        String sobrenome = scan.nextLine();

        System.out.println("Digite ano nascimento");

        int anoNascimento = scan.nextInt();

        //TODO fechar o scanner;

        scan.close();

        LocalDate data = LocalDate.now();

       int idade = data.getYear() - anoNascimento;

        System.out.println("Seu nome é: " + nome + " " + sobrenome + " - idade: " + idade);


//        (int)dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);

    }
}
