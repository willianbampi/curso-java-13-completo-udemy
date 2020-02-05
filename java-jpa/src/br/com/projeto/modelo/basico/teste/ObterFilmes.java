package br.com.projeto.modelo.basico.teste;

import java.util.List;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Ator;
import br.com.projeto.modelo.basico.Filme;

public class ObterFilmes {

	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		for(Filme filme : filmes) {
			System.out.println("Nome do filme com nota maior que 8.5: " + filme.getNome() + "\nTem nota de: " + filme.getNota());
			for(Ator ator : filme.getAtores()) {
				System.out.println("Nome dos atores desse filme: " + ator.getNome());
			}
		}
		dao.fecharTransacao();
	}

}
