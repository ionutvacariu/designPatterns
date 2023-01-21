package designpatterns.builder.example;

import designpatterns.builder.example.item.Meal;
import designpatterns.builder.example.itemType.Pepsi;
import designpatterns.builder.example.itemType.ChickenBurger;
import designpatterns.builder.example.itemType.Coke;
import designpatterns.builder.example.itemType.VegBurger;

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
