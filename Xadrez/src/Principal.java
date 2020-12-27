import modelo.Jogo;
import modelo.enums.*;
import visao.Tabuleiro;

public class Principal {

	public static void main(String[] args) {
		new Tabuleiro(new Jogo("Moisés", "João"));
	}
	
}
