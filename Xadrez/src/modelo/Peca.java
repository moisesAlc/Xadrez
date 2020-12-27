package modelo;

import javax.swing.ImageIcon;

import modelo.enums.Cor;
import modelo.enums.Posicao;
import modelo.enums.TipoPeca;

public class Peca {
	
	Posicao posicao;
	Cor cor;
	TipoPeca tipoPeca;
	Jogador jogador;
	ImageIcon imagem;
	String caminhoImagem = "imagens/";
	String extensao = ".png";
	
	public Peca(Posicao posicao, Cor cor, TipoPeca tipoPeca, Jogador jogador) {
		super();
		this.posicao = posicao;
		this.cor = cor;
		this.tipoPeca = tipoPeca;
		this.jogador = jogador;
		configuraImageIcon();
	}
	
	private void configuraImageIcon() {
		StringBuilder nomeArquivo = new StringBuilder();
		nomeArquivo.append(caminhoImagem);
		nomeArquivo.append(tipoPeca.toString());
		nomeArquivo.append(" ");
		nomeArquivo.append(cor.toString());
		nomeArquivo.append(extensao);
		System.out.println(nomeArquivo.toString());
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public TipoPeca getTipoPeca() {
		return tipoPeca;
	}
	public void setTipoPeca(TipoPeca tipoPeca) {
		this.tipoPeca = tipoPeca;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public String toString() {
		return tipoPeca.toString() + " " + cor.toString() + " em " + posicao.toString();
	}
	
}
