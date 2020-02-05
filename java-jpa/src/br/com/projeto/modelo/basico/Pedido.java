package br.com.projeto.modelo.basico;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos", schema = "curso_java_jdbc")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Date data;
    
    //padrao é lazy quando é um relacao pra muitos ou seja,
    //traz tardiamente os dados porq é uma lista de informacoes e impacta na performance e pode ocasionar erros
    //so vai fazer a pesquisa no banco se atraves do pedido for feita a chamada a lista de item de pedido
    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
    private List<ItemPedido> itens;

    public Pedido() {
        this(new Date());
    }
   
    public Pedido(Date data) {
        this.data = data;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
    
}