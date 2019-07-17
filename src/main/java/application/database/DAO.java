package application.database;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	/**
	 * persist vs merge -> merge update returen value in Database, persist does for parameter entity
	 */
	public Integer insert(String type) {
		Shape shape2 = new Shape();
		shape2.setType(type);
		final Shape merge = entityManager.merge(shape2);
		entityManager.persist(shape2);
		return merge.getId();
	}
}
