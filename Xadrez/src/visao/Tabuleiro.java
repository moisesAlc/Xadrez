package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

import modelo.Jogo;
import modelo.enums.Posicao;

public class Tabuleiro extends JFrame{

	GridBagConstraints c;
	String[] posicoes;
	Jogo jogo;
	Color corFundo;
	Color corFrente;
	Font fonte;
	
	public Tabuleiro(Jogo j) {
		this.jogo = j;
		j.situacaoDoJogo();
		iniciaComponentes();
		iniciaCampos();
		configJanela();
	}
	
	private void alternaCores() {
		if (corFundo == Color.white) {
			corFundo = Color.black;
			corFrente = Color.white;
		}
		else if (corFundo == Color.black) {
			corFundo = Color.white;
			corFrente = Color.black;
		}
	}

	private void iniciaComponentes() {
		c = new GridBagConstraints();
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.fill = GridBagConstraints.BOTH;
		getContentPane().setLayout(new GridBagLayout());
	}

	private void iniciaCampos() {
		
		fonte = new Font("Arial", Font.BOLD, 14);
		
		posicoes = Posicao.posicoes();
		
		int indicePosicoes = 0;
		
		corFundo = Color.white;
		corFrente = Color.black;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				c.gridx = i;
				c.gridy = j;
				c.ipadx = 10;
				c.ipady = 10;
				JLabel lbl = new JLabel(posicoes[indicePosicoes], JLabel.CENTER);
				lbl.setBackground(corFundo);
				lbl.setForeground(corFrente);
				lbl.setOpaque(true);
				lbl.setFont(fonte);
				getContentPane().add(lbl, c);
				
				alternaCores();
				
				indicePosicoes++;
			}
			alternaCores();
		}
		
		//testaImagens();
		
		
		
	}

	private void testaImagens() {
		c.gridx = 0;
		c.gridy = 0;
		JLabel teste = new JLabel();
		teste.setBackground(new Color(102,51,0));
		teste.setOpaque(true);
		teste.setIcon(new ImageIcon("imagens/rei preta.png"));
		//teste.setBorder(new LineBorder(Color.black));
		getContentPane().add(teste, c);
		
		c.gridx = 1;
		c.gridy = 0;
		JLabel teste2 = new JLabel();
		teste2.setBackground(Color.white);
		teste2.setOpaque(true);
		teste2.setIcon(new ImageIcon("imagens/rainha preta.png"));
		//teste2.setBorder(new LineBorder(Color.black));
		getContentPane().add(teste2, c);
		
		c.gridx = 2;
		c.gridy = 0;
		JLabel teste3 = new JLabel();
		teste3.setBackground(new Color(102,51,0));
		teste3.setBackground(Color.gray);
		teste3.setOpaque(true);
		teste3.setIcon(new ImageIcon("imagens/torre preta.png"));
		//teste3.setBorder(new LineBorder(Color.black));
		getContentPane().add(teste3, c);
	}
	
	private void configJanela() {
		setTitle("Xadrez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		//setResizable(false);
		
		
	}
	
}
