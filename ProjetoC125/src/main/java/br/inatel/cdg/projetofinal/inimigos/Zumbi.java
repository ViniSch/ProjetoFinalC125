package br.inatel.cdg.projetofinal.inimigos;

public class Zumbi extends Inimigo{

    public Zumbi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void morrer() {
        System.out.println("Arrrghhhh");
        System.out.println("O zumbi foi derrotado");
    }

    protected void setMultiplicadorDano() {
        multiplicadorDano = 1.10;
    }
}
