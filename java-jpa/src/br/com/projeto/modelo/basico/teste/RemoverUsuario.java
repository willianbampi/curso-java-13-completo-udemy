package br.com.projeto.modelo.basico.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-jpa");
        EntityManager em = emf.createEntityManager();
        
        Usuario usuario = em.find(Usuario.class, 8L);
        
        if(usuario != null){
        	System.out.println("Id: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\n\n");
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        } else {
        	System.out.println("Usuário não localizado na base");
        }

        em.close();
        emf.close();
	}

}
