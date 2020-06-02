package util;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Classe JPAUtil responsável por gerar o EntityManagerFactory e EntityManager
// Está utilizando o Padrão de Projeto Singleton, para manter uma única instância
public abstract class JPAUtil {

	private static final String PU_NAME = "estudoHibernate";	
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager entityManager = null;
	
	// Implementação do Singleton
	// Verifica se o entityManagerFactory é nulo, se for, cria um novo entityManagerFactory a partir do Persistence
	// Se não for nulo, ele retorna a mesma instância
	public static EntityManagerFactory getEntityManagerFactory() {
		if(Objects.isNull(entityManagerFactory)) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PU_NAME);
		}
		return entityManagerFactory;
	}
	
	// Mesmo padrão, porém para o EntityManager e não para o EntityManagerFactory
	public static EntityManager getEntityManager() {
		if(Objects.isNull(entityManager)) {
			EntityManagerFactory factory = getEntityManagerFactory();
		    entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
}
