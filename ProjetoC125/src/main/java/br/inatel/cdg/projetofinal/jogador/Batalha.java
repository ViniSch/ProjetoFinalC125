package br.inatel.cdg.projetofinal.jogador;

import br.inatel.cdg.projetofinal.inimigos.Inimigo;
import br.inatel.cdg.projetofinal.main.Procedimentos;

public abstract class Batalha {
    public static void enfrentar(Jogador jogador, Inimigo inimigo){
        System.out.println(jogador.getNome()+" está enfrentando "+inimigo.getNome()+"!");
        while(jogador.getVida()>0 || inimigo.getVida()>0) {
            if(jogador.getVida()<0.0){
                jogador.morrer();
                return;
            }if(inimigo.getVida()<0.0){
                inimigo.morrer();
                return;
            }
            System.out.println("Escolha uma das ações abaixo:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Correr(É necessário uma habilidade maior que 12)");
            switch (Procedimentos.playerInputFight()) {
                case 1 -> jogador.atacar(inimigo);
                case 2 -> {
                    if(jogador.correr(inimigo)){
                        return;
                    }
                }
            }
            if(inimigo.getVida()>0.0)
            inimigo.atacar(jogador);
        }
    }
}
