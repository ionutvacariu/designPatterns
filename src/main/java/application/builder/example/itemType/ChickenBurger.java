package application.builder.example.itemType;

import application.builder.example.item.Burger;

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
