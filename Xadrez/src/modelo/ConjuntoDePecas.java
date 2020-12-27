package modelo;

import java.util.ArrayList;

import modelo.enums.Cor;
import modelo.enums.Posicao;
import modelo.enums.TipoPeca;

/* Classe que simbolizará o conjunto de peças de um determinado Jogador */

public class ConjuntoDePecas {

	ArrayList<Peca> pecas;
	
	public ConjuntoDePecas(Jogador jogador) {
		pecas = new ArrayList<>();
		Cor cor = jogador.cor;
		if (jogador.cor == Cor.BRANCA) {
			pecas.add(new Peca(Posicao.A1, cor, TipoPeca.TORRE, jogador));
			pecas.add(new Peca(Posicao.B1, cor, TipoPeca.CAVALO, jogador));
			pecas.add(new Peca(Posicao.C1, cor, TipoPeca.BISPO, jogador));
			pecas.add(new Peca(Posicao.D1, cor, TipoPeca.RAINHA, jogador));
			pecas.add(new Peca(Posicao.E1, cor, TipoPeca.REI, jogador));
			pecas.add(new Peca(Posicao.F1, cor, TipoPeca.BISPO, jogador));
			pecas.add(new Peca(Posicao.G1, cor, TipoPeca.CAVALO, jogador));
			pecas.add(new Peca(Posicao.H1, cor, TipoPeca.TORRE, jogador));
			
			pecas.add(new Peca(Posicao.A2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.B2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.C2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.D2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.E2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.F2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.G2, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.H2, cor, TipoPeca.PEAO, jogador));
		}else if (jogador.cor == Cor.PRETA) {
			pecas.add(new Peca(Posicao.A8, cor, TipoPeca.TORRE, jogador));
			pecas.add(new Peca(Posicao.B8, cor, TipoPeca.CAVALO, jogador));
			pecas.add(new Peca(Posicao.C8, cor, TipoPeca.BISPO, jogador));
			pecas.add(new Peca(Posicao.D8, cor, TipoPeca.RAINHA, jogador));
			pecas.add(new Peca(Posicao.E8, cor, TipoPeca.REI, jogador));
			pecas.add(new Peca(Posicao.F8, cor, TipoPeca.BISPO, jogador));
			pecas.add(new Peca(Posicao.G8, cor, TipoPeca.CAVALO, jogador));
			pecas.add(new Peca(Posicao.H8, cor, TipoPeca.TORRE, jogador));
			
			pecas.add(new Peca(Posicao.A7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.B7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.C7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.D7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.E7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.F7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.G7, cor, TipoPeca.PEAO, jogador));
			pecas.add(new Peca(Posicao.H7, cor, TipoPeca.PEAO, jogador));
		}
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Peca peca : pecas) {
			sb.append(peca);
			sb.append("\n");
		}
		return sb.toString();
	}
}
