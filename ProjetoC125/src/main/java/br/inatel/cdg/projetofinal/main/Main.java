package br.inatel.cdg.projetofinal.main;

import br.inatel.cdg.projetofinal.inimigos.*;
import br.inatel.cdg.projetofinal.jogador.Batalha;
import br.inatel.cdg.projetofinal.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Player 1", 100);
        Inimigo lobo = new Lobo("Lobo", 100);
        Inimigo zumbi = new Zumbi("Zumbi", 100);
        Inimigo urso = new Urso("Urso", 100);
        Inimigo vampiro = new Vampiro("Vampiro", 100);

        //Chamando procedimento de entrada
        Procedimentos.boasVindas();

        //Chama o procedimento de leitura de dados
        switch (Procedimentos.playerInputStart())
        {
            case 1 -> Batalha.enfrentar(jogador,lobo);
            case 2 -> Batalha.enfrentar(jogador,zumbi);
            case 3 -> Batalha.enfrentar(jogador,urso);
            case 4 -> Batalha.enfrentar(jogador,vampiro);
        }
    }
}
