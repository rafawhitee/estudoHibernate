package util;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JPAUtil {

	private static final String PU_NAME = "estudoHibernate";	
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager entityManager = null;
	
	// Método static para ser acesso de qualquer lugar
	// Implementação do Singleton (se já tiver diferente de nulo, retorna), se não, cria um novo EntityManagerFactory
	public static EntityManagerFactory getEntityManagerFactory() {
		if(Objects.isNull(entityManagerFactory)) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PU_NAME);
		}
		return entityManagerFactory;
	}
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = getEntityManagerFactory();
		if(Objects.isNull(entityManager)) {
		    entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
}
