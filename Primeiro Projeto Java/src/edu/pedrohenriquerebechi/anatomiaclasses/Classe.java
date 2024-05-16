package edu.pedrohenriquerebechi.anatomiaclasses;

public class Classe { /*CLASSE*/

public static void main (String [] args) { /*MÉTODO*/

    /*PRINT*/

    System.out.print ( "Olá!");

    /*VARIÁVEIS*/

    int ano = 2021; /*Definindo variável */
    ano = 2024; /*Alterando variável */
    final String BR = "Brasil"; /*Variável não deve ser alterada */

    /*DECLARANDO VARIÁVEIS E MÉTODOS | ESTRUTURAS */

    String meuNome = "Pedro";
    int idade = 2;
    double altura = 23.4; // double = float
    boolean verdadeira = true;

    String primeiroNome = "João";
    String segundoNome = "Azevedo";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

    // JAVA BEANS - LEGIBILIDADE

}

public static String nomeCompleto (String primeiroNome, String segundoNome) { // MÉTODO
    return " --> " + primeiroNome.concat(" ").concat(segundoNome);
}

}