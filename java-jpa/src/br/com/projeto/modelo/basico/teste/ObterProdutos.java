package br.com.projeto.modelo.basico.teste;

import java.util.List;

import br.com.projeto.infra.ProdutoDAO;
import br.com.projeto.modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto : produtos) {
			System.out.println("Id: " + produto.getId() + "\nNome: " + produto.getNome() + "\n");
		}
		
		double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p) -> t + p).doubleValue();
		System.out.println("O valor total é R$ " + precoTotal);
		dao.fecharTransacao();
	}

}
