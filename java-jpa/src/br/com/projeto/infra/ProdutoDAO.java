package br.com.projeto.infra;

import br.com.projeto.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
	
	public ProdutoDAO() {
		super(Produto.class);
	}

}
