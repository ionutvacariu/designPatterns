package designpatterns.factory.example;

import java.util.Optional;

/**
 * S O LI D - open close principle
 *  	    - dependency inversion -- depends on interface which return implementation by type passed as parameter
 *
 */
public class Factory {

	public Optional<Shape> getShape(String type) {
		if ("CIRCLE".equalsIgnoreCase(type)) {
			return Optional.of(new Circle());
		} else if ("RECTANGLE".equalsIgnoreCase(type)) {
			return Optional.of(new Rectangle());
		}
		return Optional.empty();
	}
}
