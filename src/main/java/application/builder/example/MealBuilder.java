package application.builder.example;

import application.builder.example.item.Meal;
import application.builder.example.itemType.Pepsi;
import application.builder.example.itemType.ChickenBurger;
import application.builder.example.itemType.Coke;
import application.builder.example.itemType.VegBurger;

/*

S  OLID - single responibility
 */
public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
