package e4.oneToMany;

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
		entityManager.persist(new Lab("lab123","extra info about lab",
				Arrays.asList(new Branch("123"), 
						new Branch("xyz") ) ) );
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
