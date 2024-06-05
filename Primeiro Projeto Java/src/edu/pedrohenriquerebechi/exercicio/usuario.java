package edu.pedrohenriquerebechi.exercicio;

public class usuario {

    public static void main(String[] args) throws Exception {
        exercicioSmartTV smartTV = new smartTV();

        System.out.println("TV ligada? " + smartTV.ligada)
        System.out.println("Canal atual? " + smartTV.canal)
        System.out.println("Volume atual? " + smartTV.volume)

        smartTV.ligar();
        System.out.println("Novo status TV ligada? " + smartTV.ligada)

    }
}