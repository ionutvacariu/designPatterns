package designpatterns.builder.example.itemType;

import designpatterns.builder.example.item.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
