package application.spring.controllers;

import application.spring.database.DAO;
import application.spring.database.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prototype.Prototype;

@RestController
public class HelloController {

	@Autowired
	private DAO dao;

	public HelloController() {
	}

	@Autowired
	private Prototype prototype;

	@RequestMapping("/")
	public String index() {

		final int insertT = dao.insert("TOM");
		final int insertG = dao.insert("GEORGE");

		final Shape shape = prototype.getShapePrototype(insertT);
		prototype.getShapePrototype(insertG);
		final Shape shapePrototypeed = prototype.getShapePrototype(insertT);
		System.out.println(shape);
		System.out.println(shapePrototypeed);
		return String.valueOf(shape.equals(shapePrototypeed));
	}

}