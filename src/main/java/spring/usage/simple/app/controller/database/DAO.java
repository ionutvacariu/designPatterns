package spring.usage.simple.app.controller.database;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    /**
     * persist vs merge -> merge update returned value in Database, persist does for parameter entity
     */
    public Integer insert(String type) {
        Shape shape2 = new Shape();
        shape2.setType(type);
        final Shape merge = entityManager.merge(shape2);
        entityManager.persist(shape2);
        return merge.getId();
    }
}
