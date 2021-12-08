package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class AplicacaoGet {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p1 = em.find(Pessoa.class, 1);
		
		emf.close();
		em.close();
		
		System.out.println(p1);
	}

}
