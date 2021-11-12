package com.cg.jpalab.demo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AuthorDemo {
	
	

		public static void main(String[] args) {
			System.out.println("Start");

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tr = em.getTransaction();

			tr.begin();

		Author a1 = new Author(101,"Umang","Singh", "726561499");
		Author a2 = new Author(102,"Abhi","Shek", "7261945678");
		Author a3 = new Author(103,"Golu","abcd", "9874561230");
		Author a4 = new Author(104,"Lata","mnb", "8851439256");
			
//			em.persist(a1); // insert
//			em.persist(a2);
//			em.persist(a3);
//			em.persist(a4);

			a2.setFirstName("Umesh");
			em.merge(a2); // update
			System.out.println(a2.toString());
			

			//em.remove(em.find(Author .class, 102)); // delete

	//		Author emp4 = em.find(Author.class, 101); // select
	//		System.out.println(a4.toString());
			tr.commit();

			System.out.println("End");

		}

	
}
