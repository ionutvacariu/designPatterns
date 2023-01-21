package designpatterns.factory.example;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		Factory f = new Factory();
		final Optional<Shape> circle = f.getShape("CIRCLE");

		if(circle.isPresent()){
			circle.get().draw();
		}

		final Optional<Shape> rectangle = f.getShape("RECTANGLE");

		if(rectangle.isPresent()){
			rectangle.get().draw();
		}
	}
}
