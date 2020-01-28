package br.com.projeto.calculadora.modelo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

	private static final long serialVersionUID = 1L;

	public Botao(String texto, Color cor){
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.PLAIN, 25));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
