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

        Pessoa pessoa = new Pessoa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");

        pessoa.nome = scan.nextLine();

        System.out.println("Digite seu sobrenome");

        pessoa.sobrenome = scan.nextLine();

        System.out.println("Digite ano nascimento");

        pessoa.anoNascimento = scan.nextInt();

        //TODO fechar o scanner;

        scan.close();


        pessoa.mostrarMensagem();


//        (int)dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);

    }
}
