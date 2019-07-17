package application.builder.example.itemType;

import application.builder.example.item.Bottle;
import application.builder.example.Item;
import application.builder.example.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
