package application.builder.example.item;

import application.builder.example.Packing;

public class Bottle implements Packing {
	@Override
	public String pack() {
		return "Bottle";
	}
}
