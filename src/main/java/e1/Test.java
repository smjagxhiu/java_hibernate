package e1;

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
		entityManager.persist(new Person("john doe"));
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
