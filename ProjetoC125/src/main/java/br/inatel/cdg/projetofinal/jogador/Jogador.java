package br.inatel.cdg.projetofinal.jogador;
import br.inatel.cdg.projetofinal.inimigos.Inimigo;

import java.util.Random;

public class Jogador {
    private String nome;
    private double vida;

    public Jogador(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo inimigo){
        //Gera um numero aleatório entre 0 e 20
        Random rn = new Random();
        int i = rn.nextInt(21);

        //Caso o jogador tenha tirado 20, causará dano crítico (dobro do dano)
        if(i==20) {
            System.out.println("Critical Hit!!!");
            i = 40;
        }
        inimigo.setVida(inimigo.getVida()-i);
        System.out.println("O jogador "+nome+" realizou um ataque e causou "+i+" de dano no inimigo!");
        if(inimigo.getVida()>0.0)
            inimigo.informarVida();
    }

    public void morrer(){
        System.out.println("O jogador "+getNome()+" foi derrotado!");
    }

    public void informarVida(){
        System.out.println("Vida do jogador "+getNome()+": "+getVida()+" HP");
    }

    public boolean correr(Inimigo inimigo){
        //O jogador poderá fugir do inimigo se conseguir um número maior que 12 no dado(D20)

        //Gera um numero aleatório entre 0 e 20
        Random rn = new Random();
        int i = rn.nextInt(21);

        if(i>12){
            System.out.println("O jogador conseguiu fugir do "+inimigo.getNome());
            setVida(100);
            return true;
        }
        else{
            System.out.println("O jogador não conseguiu escapar do "+inimigo.getNome());
            return false;
        }
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
