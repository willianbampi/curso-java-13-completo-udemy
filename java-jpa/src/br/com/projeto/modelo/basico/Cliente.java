package br.com.projeto.modelo.basico;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes", schema = "curso_java_jdbc")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    //mapeia a relacao um para um com a classe Assento
    //cascade para fazer operacoes em cascata no banco automaticamente, desde que os dados estejam preenchidos
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    //mapeamento que representa juncao de tabela para garantir que o valor seja unico no banco de dados, 
    //como é @OneToOne tem que usar @JoinColumn
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

    public Cliente() {

    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

}
