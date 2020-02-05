package br.com.projeto.modelo.basico.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-jpa");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 5L);
        System.out.println("Id: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\n\n");

        usuario.setNome("Alter1");
        usuario.setEmail("alter1@teste.com.br");

        em.merge(usuario);

        em.getTransaction().commit();

        usuario = em.find(Usuario.class, 5L);
        System.out.println("Id: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\n\n");

        em.close();
        emf.close();
	}

}
