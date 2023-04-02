package main.java.modelo;

import main.java.modelo.enums.Cor;

public class Jogador {

	Cor cor;
	ConjuntoDePecas conjuntoDePecas;
	String nome;
	
	
	
	public Jogador(String nome, Cor cor) {
		super();
		this.cor = cor;
		this.nome = nome;
		this.conjuntoDePecas = new ConjuntoDePecas(this);
	}

	public Jogador(Cor cor) {
		super();
		this.cor = cor;
		this.nome = "";
		this.conjuntoDePecas = new ConjuntoDePecas(this);
	}
	
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public ConjuntoDePecas getConjuntoDePecas() {
		return conjuntoDePecas;
	}
	public void setConjuntoDePecas(ConjuntoDePecas conjuntoDePecas) {
		this.conjuntoDePecas = conjuntoDePecas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
