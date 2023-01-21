package designpatterns.builder.example.itemType;

import designpatterns.builder.example.item.Burger;

public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}
}
