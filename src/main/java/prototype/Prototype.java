package prototype;

import spring.usage.simple.app.controller.database.Shape;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

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
