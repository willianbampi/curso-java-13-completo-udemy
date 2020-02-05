package br.com.projeto.modelo.basico.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Teste9","teste9@teste.com.br");
       
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();
       
        em.close();
        emf.close();
	}

}
