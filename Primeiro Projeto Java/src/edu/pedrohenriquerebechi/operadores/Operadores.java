package edu.pedrohenriquerebechi.operadores;

public class Operadores {
    public static void main(String[] args) {

        // ATRIBUIÇÃO: "=" 
        
        int idade = 19;

        // ARITMÉTICOS: +, -, *, /

        int soma = 23 + 33;

        // Concatenação 
        String nomeCompleto = "Pedro " + "Henrique";
        System.out.println(nomeCompleto);

        // UNÁRIOS: +, ++, -, --, !

        int numero = 4;
        numero = - numero;
        System.out.println("Numero negativo: " + numero); 

        int outroNumero = -7;
        numero = outroNumero * -1;
        System.out.println("Numero positivo: " + outroNumero);

        int num = 5;
        num++;
        System.out.println("Numero incrementado: " + num);

        boolean variavel = true;
        System.out.println("Inverte valor: " + !variavel);
        
    }
}
