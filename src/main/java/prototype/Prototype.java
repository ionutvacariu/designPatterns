package prototype;

import application.database.Shape;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Map;

@Component
public class Prototype {

	@PersistenceContext
	private EntityManager entityManager;

	private static Map<Integer, Shape> shapePrototype = new HashMap<>();

	public Shape getShapePrototype(Integer id) {
		if (shapePrototype.get(id) == null) {
			final Shape t = entityManager.find(Shape.class, id);
			shapePrototype.put(id, t);
		}
		return shapePrototype.get(id);
	}

}
