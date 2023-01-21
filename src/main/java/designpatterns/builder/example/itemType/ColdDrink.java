package designpatterns.builder.example.itemType;

import designpatterns.builder.example.item.Bottle;
import designpatterns.builder.example.Item;
import designpatterns.builder.example.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
