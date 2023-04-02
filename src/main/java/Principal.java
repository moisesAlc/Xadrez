package main.java;

import main.java.modelo.Jogo;
import main.java.visao.Tabuleiro;

public class Principal {

	public static void main(String[] args) {
		new Tabuleiro(new Jogo("Moisés", "João"));
	}
	
}
