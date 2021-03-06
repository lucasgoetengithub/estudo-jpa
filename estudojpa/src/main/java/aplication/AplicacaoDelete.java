package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class AplicacaoDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Pessoa p1 = em.find(Pessoa.class, 3);		
		em.remove(p1);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
		System.out.println("done!");
	}

}
