package application.builder.example.item;

import application.builder.example.itemType.ColdDrink;

public class Pepsi extends ColdDrink {
	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}
}
