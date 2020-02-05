package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.ItemPedido;
import br.com.projeto.modelo.basico.Pedido;
import br.com.projeto.modelo.basico.Produto;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
	       
        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 10);
        dao.abrirTransacao().incluir(produto).incluir(pedido).incluir(item).commitarTransacao().fecharTransacao();
	}

}
