package util;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Classe JPAUtil respons�vel por gerar o EntityManagerFactory e EntityManager
// Est� utilizando o Padr�o de Projeto Singleton, para manter uma �nica inst�ncia
public abstract class JPAUtil {

	private static final String PU_NAME = "estudoHibernate";	
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager entityManager = null;
	
	// Implementa��o do Singleton
	// Verifica se o entityManagerFactory � nulo, se for, cria um novo entityManagerFactory a partir do Persistence
	// Se n�o for nulo, ele retorna a mesma inst�ncia
	public static EntityManagerFactory getEntityManagerFactory() {
		if(Objects.isNull(entityManagerFactory)) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PU_NAME);
		}
		return entityManagerFactory;
	}
	
	// Mesmo padr�o, por�m para o EntityManager e n�o para o EntityManagerFactory
	public static EntityManager getEntityManager() {
		if(Objects.isNull(entityManager)) {
			EntityManagerFactory factory = getEntityManagerFactory();
		    entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
}
