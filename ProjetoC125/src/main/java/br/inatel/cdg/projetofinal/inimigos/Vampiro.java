package br.inatel.cdg.projetofinal.inimigos;

public class Vampiro extends Inimigo{

    public Vampiro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void morrer() {
        System.out.println("Ahhhhhhhh");
        System.out.println("O vampiro foi derrotado!");
    }

    protected void setMultiplicadorDano() {
        multiplicadorDano = 1.25;
    }
}
