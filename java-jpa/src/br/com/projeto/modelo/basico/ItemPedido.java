package br.com.projeto.modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itens_pedidos", schema = "curso_java_jdbc")
public class ItemPedido {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private int quantidade;
    
    @Column(nullable = false)
    private Double preco;
    
    //padrao é eager quando é um relacao pra um ou seja, 
    //já traz pronta a consulta do produto ao consultar o item de pedido
    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;
    
    @ManyToOne
    private Pedido pedido;

    public ItemPedido() {

    }

    public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		if(produto != null && this.preco == null){
	        this.setPreco(produto.getPreco());
	    }
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
