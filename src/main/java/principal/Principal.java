package principal;

import javax.persistence.EntityManager;

import util.JPAUtil;

public class Principal {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		Object listGeneric = em.createNativeQuery("SELECT * FROM T_PAI_JOINED").getResultList();
		System.out.println(listGeneric);
	}

}
