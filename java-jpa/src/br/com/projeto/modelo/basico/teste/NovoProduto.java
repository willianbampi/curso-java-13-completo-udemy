package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		Produto produto = new Produto("Monitor 23", 789.98);
		
		dao.abrirTransacao().incluir(produto).commitarTransacao().fecharTransacao();
		
		System.out.println("Id do produto: " + produto.getId());
	}

}
