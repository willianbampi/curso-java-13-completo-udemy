package br.com.projeto.modelo.basico;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores", schema = "curso_java_jdbc")
public class Ator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "atores", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Filme> filmes;
	
	public Ator() {
		
	}
	
	public Ator(String nome) {
		this.nome = nome;
	}
	
	public void adicionarFilme(Filme filme) {
		if(filme != null && !getFilmes().contains(filme)) {
			getFilmes().add(filme);
			if(!filme.getAtores().contains(this)) {
				filme.getAtores().add(this);
			}
		}
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

	public List<Filme> getFilmes() {
		if(filmes == null) {
			filmes = new ArrayList<>();
		}
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

}
