package e5.manyToOne;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static final String JPA_UNIT = 
			"jpa_unit" ;

	public static void main(String[] args) {
		EntityManagerFactory sessionFactory  =
				Persistence.createEntityManagerFactory(JPA_UNIT);
		EntityManager entityManager = sessionFactory.createEntityManager();
		entityManager.getTransaction().begin();
		//entityManager.persist(new Supplier("supplier123")); // run this once to insert a supplier so we add to the order
		Supplier s = entityManager.find(Supplier.class, 1L);
		System.out.println(s.getName());
		entityManager.persist(new Order(12,s));
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
