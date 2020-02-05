package br.com.projeto.modelo.basico;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/*
mapeamento para a estrategia de single-table
@DiscriminatorValue("AB")
*/

//mapeamento para a estrategia de joined
@DiscriminatorValue("AB")

public class AlunoBolsista extends Aluno {
	
	private double valorBolsa;
	
	public AlunoBolsista() {
		
	}
	
	public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
		super(matricula, nome);
		this.valorBolsa = valorBolsa;
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

}
