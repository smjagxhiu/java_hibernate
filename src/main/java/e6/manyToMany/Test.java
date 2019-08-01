package e6.manyToMany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static final String JPA_UNIT = "jpa_unit" ;

	public static void main(String[] args) {
		EntityManagerFactory sessionFactory  =
				Persistence.createEntityManagerFactory(JPA_UNIT);
		EntityManager entityManager = sessionFactory.createEntityManager();
		entityManager.getTransaction().begin();
		//entityManager.persist(new Role("admin"));
		//entityManager.persist(new Role("user"));
		//entityManager.persist(new Permission("CREATE USER"));
		//entityManager.persist(new Permission("READ USER"));
		Role role = entityManager.find(Role.class, 1L);
		Permission p1 = entityManager.find(Permission.class, 1L);
		Permission p2 = entityManager.find(Permission.class, 2L);
		role.setPermissions(Arrays.asList(p1,p2));
		entityManager.persist(role);
		System.out.println(p1);
		// run this once to insert a supplier so we add to the order
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
