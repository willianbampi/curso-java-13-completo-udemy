package br.com.projeto.modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos", schema = "curso_java_jdbc")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    //mapeando a bidirecionalidade feita na classe cliente para nao dar incosistencia no banco
    //referencia diretamente o atributo assento definido dentro da classe Cliente para nao repetir atributo na tabela
    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento() {

    }

    public Assento(String nome) {
        this.nome = nome;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
