package br.inatel.cdg.projetofinal.inimigos;

import br.inatel.cdg.projetofinal.jogador.Jogador;

import java.util.Random;

public abstract class Inimigo {
    protected String nome; //Armazena o nome do inimigo

    protected double vida; //Armazena a vida do inimigo

    protected double multiplicadorDano; //Define o multiplicador de dano de acordo com o inimigo
    //Lobo = 1x
    //Zumbi = 1.10x
    //Urso = 1.15x
    //Vampiro = 1.25x

    public Inimigo(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Jogador jogador){
        //Gera um numero aleatório entre 0 e 20
        Random rn = new Random();
        int i = rn.nextInt(21);

        //Define multiplicador de dano
        setMultiplicadorDano();

        System.out.println("-------------------------------");

        //Caso o inimigo tenha tirado 20, causará dano crítico (dobro do dano)
        if(i==20) {
            System.out.println("Critical Hit!!!");
            i = 40;
        }
        jogador.setVida(jogador.getVida()-(i*getMultiplicadorDano()));
        System.out.println("O "+nome+" realizou um ataque e causou "+i+" de dano no jogador!");
        if(jogador.getVida()>0.0)
            jogador.informarVida();
    }

    public void morrer(){
        System.out.println("O inimigo foi derrotado!");
    }

    protected abstract void setMultiplicadorDano();

    protected double getMultiplicadorDano(){
        return multiplicadorDano;
    }

    public void informarVida(){
        System.out.println("Vida do inimigo "+getNome()+": "+getVida()+" HP");
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
