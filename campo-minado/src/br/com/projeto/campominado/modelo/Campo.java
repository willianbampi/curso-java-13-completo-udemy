package br.com.projeto.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.campominado.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			return addListaVizinho( vizinho);
		} else if(deltaGeral == 2 && diagonal) {
			return addListaVizinho( vizinho);
		} else {
			return false;
		}
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {
		minado = true;
	}
	
	boolean objetivoAlcancado(){
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "X";
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		} else if(aberto) {
			return " ";
		} else {
			return "?";
		}
	}
	
	private boolean addListaVizinho(Campo vizinho) {
		vizinhos.add(vizinho);
		return true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isNaoMinado() {
		return !isMinado();
	}

	public void setMinado(boolean minado) {
		this.minado = minado;
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isDesmarcado() {
		return !isMarcado();
	}

	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}

	public List<Campo> getVizinhos() {
		if(vizinhos == null) {
			return new ArrayList<>();
		}
		return vizinhos;
	}

	public void setVizinhos(List<Campo> vizinhos) {
		this.vizinhos = vizinhos;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	
}
