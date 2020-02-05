package br.com.projeto.modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedores", schema = "curso_java_jdbc")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	//como a classe Endereco esta com a anotacao @Embeddable 
	//os atributos da classe Endereco serão criados dentro da tabela referente a classe Fornecedor
	private Endereco endereco;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


}
