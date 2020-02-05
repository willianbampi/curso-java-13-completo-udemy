package br.com.projeto.modelo.basico.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-jpa");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 2L);
        System.out.println("Id: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\n\n");

        em.detach(usuario);//tira o objeto do estado gerenciado
        usuario.setNome("Alter3");
        usuario.setEmail("alter3@teste.com.br");

        em.merge(usuario);//faz um merge para atualizar os dados no banco, senao nao atualiza

        em.getTransaction().commit();

        usuario = em.find(Usuario.class, 2L);
        System.out.println("Id: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\n\n");

        em.close();
        emf.close();
	}

}
