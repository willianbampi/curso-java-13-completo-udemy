package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.ItemPedido;
import br.com.projeto.modelo.basico.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		Pedido pedido = dao.obterPorId(1L);
		//dao.fecharTransacao() 
		//se eu fechar o dao ele vai dar erro no for 
		//porq a conexao vai estar fechada 
		//e o hibernate vai tentar trazer a lista de itens de forma tardia
		//para nao dar erro eu posso forcar no mapeamento do Pedido.class
		//colocando o FetchType para EAGER no List<ItemPedido> itens
		//porem pode ocasionar problema de performance e dar erro
		for(ItemPedido item: pedido.getItens()) {
			System.out.println("Quantidade de item do pedido (através da lista de itens dentro do pedido que foi consultado por id): " + item.getQuantidade());
			System.out.println("Nome do produto (atraves do item de pedido, que é uma lista dentro do pedido que foi consultado por id ): " + item.getProduto().getNome());
		}
		dao.fecharTransacao();
		
	}

}
