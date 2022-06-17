package br.inatel.cdg.projetofinal.inimigos;

public class Lobo extends Inimigo{
    public Lobo(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void morrer() {
        System.out.println("Auuuuuuu!");
        System.out.println("O lobo foi derrotado!");
    }


    protected void setMultiplicadorDano() {
        multiplicadorDano = 1;
    }
}
