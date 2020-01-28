package br.com.projeto.calculadora.modelo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.projeto.calculadora.visao.Memoria;
import br.com.projeto.calculadora.visao.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador{

	private static final long serialVersionUID = 1L;
	
	private final JLabel label;

    public Display(){
        Memoria.getInstancia().adicionarObservador(this);
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void valorAlterado(String novoValor){
        label.setText(novoValor);
    }
}