package br.inatel.cdg.projetofinal.inimigos;

public class Urso extends Inimigo{

    public Urso(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void morrer() {
        System.out.println("Rawwwwww!");
        System.out.println("O urso foi derrotado!");
    }

    protected void setMultiplicadorDano() {
        multiplicadorDano = 1.15;
    }
}
