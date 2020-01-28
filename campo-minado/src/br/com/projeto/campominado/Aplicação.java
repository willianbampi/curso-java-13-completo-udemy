package br.com.projeto.campominado;

import br.com.projeto.campominado.modelo.Tabuleiro;
import br.com.projeto.campominado.visao.Console;

public class Aplica��o {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (6, 6, 6);
		
		new Console(tabuleiro);
		
		tabuleiro.abrir(3, 3);
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);
		
		System.out.println(tabuleiro);
		
	}

}
