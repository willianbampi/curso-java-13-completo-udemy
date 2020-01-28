package br.com.projeto.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean minado = false;
	private boolean aberto = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
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
	
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}
	
	public boolean abrir() {
		if(!aberto && !marcado) {
			
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean vizinhancaSegura() {
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
	
	public int minasNaVizinhanca() {
		return (int) vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservadores(CampoEvento.REINICIAR);
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
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);
		}
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

	public List<CampoObservador> getObservadores() {
		if(observadores == null) {
			return new ArrayList<>();
		}
		return observadores;
	}

	public void setObservadores(List<CampoObservador> observadores) {
		this.observadores = observadores;
	}

	
}
