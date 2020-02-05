package br.com.projeto.modelo.basico.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-jpa");
        EntityManager em = emf.createEntityManager();
       
        Usuario usuario = em.find(Usuario.class, 1L);
        System.out.println("Nome do usuario: " + usuario.getNome());

        em.close();
        emf.close();
	}

}
