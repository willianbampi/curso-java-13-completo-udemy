package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Ator;
import br.com.projeto.modelo.basico.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme filme1 = new Filme("Filme 1", 8.9);
		Filme filme2 = new Filme("Filme 2", 8.1);
		
		Ator ator1 = new Ator("Ator 1");
		Ator ator2 = new Ator("Ator 2");
		Ator ator3 = new Ator("Ator 3");
		
		filme1.adicionarAtor(ator1);
		filme1.adicionarAtor(ator2);
		
		filme2.adicionarAtor(ator1);
		filme2.adicionarAtor(ator3);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filme1);
		
		dao.fecharTransacao();
		
	}

}
