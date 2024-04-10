package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
		
		//Instanciando pessoas
		/*Pessoa p1 = new Pessoa(null, "Carlos da silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "joao da silva", "joao@gmail.com");
		Pessoa p3 = new Pessoa(null, "caio da silva", "caio@gmail.com");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//ADICIONA BD
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		//CONSULTA BD
		/*Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);*/
		
		//REMOVE BD
		/*em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		em.getTransaction().commit();*/
		
		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}

}
