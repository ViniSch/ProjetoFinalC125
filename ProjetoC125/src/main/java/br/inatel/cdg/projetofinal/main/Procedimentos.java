package br.inatel.cdg.projetofinal.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Procedimentos {
    public static void boasVindas(){
        //Texto de início e explicação do jogo
        System.out.println("Olá guerreiro!");
        System.out.println("Este jogo tem como objetivo neutralizar os inimigos através de um sistema de combate por sorte");
        System.out.println("Para realizar as ações de combate, será sorteado um número ente 0 e 20.");
        System.out.println("Esse número indicará a força de seu ataque ou a chance de execução de uma habilidade");
        System.out.println("Boa sorte!");
        System.out.println("Cada inimigo causa dano diferente no jogador");
        System.out.println("Para iniciar, escolha um inimigo para enfrentar:");
        System.out.println("1 - Lobo");
        System.out.println("2 - Zumbi");
        System.out.println("3 - Urso");
        System.out.println("4 - Vampiro");
    }

    public static int playerInputStart(){
        //Analisa se a entrada é do tipo int e 0>num<6(evita InputMismatch);
        int num = 0;
        while(num==0||num>5||num<1) {
            Scanner entrada = new Scanner(System.in);
            try {
                num = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Caráctere Inválido");
            }
            if(num > 5 || num < 1)
                System.out.println("Insira apenas numeros de 1 a 5");
        }
        return num;
    }

    public static int playerInputFight(){
        //Analisa se a entrada é do tipo int (evita InputMismatch);
        int num = 0;
        while(num==0||num>2||num<1) {
            Scanner entrada = new Scanner(System.in);
            try {
                num = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Caráctere Inválido");
            }
            if(num > 2 || num < 1)
                System.out.println("Insira apenas numeros de 1 a 2");
        }
        return num;
    }
}
