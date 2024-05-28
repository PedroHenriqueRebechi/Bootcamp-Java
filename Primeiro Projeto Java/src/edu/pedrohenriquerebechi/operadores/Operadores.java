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

        // TERNÁRIO: Resumir  "?:"

        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ?"Verdadeiro" :"Falso"; //IF e ELSE resumido
        System.out.println(resultado);

        // RELACIONAIS: Avaliam a relação entre duas variaveis ou expressões

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que numero2? " + simNao);

        // Para objetos

        String nomeUm = "Pedro";
        String nomeDois = "Pedro";

        System.out.println(nomeUm.equals(nomeDois));

        // LÓGICOS
        // && Operador "E/AND"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        else {
            System.out.println("Alguma das condições é falsa");
        }

        // || Operador "OU/OR"

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }






         


        
    }
}
