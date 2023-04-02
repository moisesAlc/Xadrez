package main.java.modelo;

import java.util.ArrayList;
import main.java.modelo.enums.Cor;

public class Jogo {

	ArrayList<Jogador> jogadores;
	String jogadorDaVez;
	
	public Jogo(String nomeJogadorBranco, String nomeJogadorPreto) {
		super();
		this.jogadores = new ArrayList<Jogador>();
		this.jogadores.add(new Jogador(nomeJogadorBranco, Cor.BRANCA));
		this.jogadores.add(new Jogador(nomeJogadorPreto, Cor.PRETA));
		jogadorDaVez = nomeJogadorBranco;
	}
	
	public void situacaoDoJogo() {
		for (Jogador jogador : jogadores) {
			System.out.println(jogador.getConjuntoDePecas());
		}
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	
}
