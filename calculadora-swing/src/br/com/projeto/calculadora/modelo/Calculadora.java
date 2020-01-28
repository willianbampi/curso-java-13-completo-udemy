package br.com.projeto.calculadora.modelo;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculadora extends JFrame {
	   
	private static final long serialVersionUID = 1L;

	public Calculadora(){

        organizarLayout();

        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new Calculadora();
    }

    private void organizarLayout(){
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

}
