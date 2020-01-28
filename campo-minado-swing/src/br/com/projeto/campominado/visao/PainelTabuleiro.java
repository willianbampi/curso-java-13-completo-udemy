package br.com.projeto.campominado.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.projeto.campominado.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu :(");
				}
				
				tabuleiro.reiniciar();
				
			});
		});
	}

}
