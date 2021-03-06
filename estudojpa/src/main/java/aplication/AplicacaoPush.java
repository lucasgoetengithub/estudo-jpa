package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class AplicacaoPush {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Lucas Goeten", "lucasgoeten@gmail.com");
		Pessoa p2 = new Pessoa(null, "William Goeten", "williamgoeten@gmail.com");
		Pessoa p3 = new Pessoa(null, "Edenilson Goeten", "edenilsongoeten@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("done!");
	}

}
