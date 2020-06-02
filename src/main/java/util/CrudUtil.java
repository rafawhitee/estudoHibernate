package util;

import javax.persistence.EntityManager;

public abstract class CrudUtil {

	private static EntityManager em;

	public static Object inserir(Object entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		return entity;
	}

	public static Object atualizar(Object entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		return entity;
	}

	public static boolean excluir(Object entity) {
		boolean retorno;
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			retorno = true;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			retorno = false;
		}
		return retorno;
	}

	public static Object findById(Class<?> classe, Integer id) {
		Object retorno;
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			retorno = em.find(classe, id);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			retorno = null;
		}
		return retorno;
	}

}