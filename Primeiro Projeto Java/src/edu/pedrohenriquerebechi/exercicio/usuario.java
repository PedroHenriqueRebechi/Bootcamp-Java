package edu.pedrohenriquerebechi.exercicio;

public class usuario {

    public static void main(String[] args) throws Exception {
        exercicioSmartTV smartTV = new exercicioSmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual? " + smartTV.canal);
        System.out.println("Volume atual? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status TV desligada: " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Aumenta o volume, agora está: " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Diminui o volume, agora está: " + smartTV.volume);

        smartTV.mudarCanal(34);
        System.out.println("Canal escolhido: " + smartTV.canal);
        
    }
}