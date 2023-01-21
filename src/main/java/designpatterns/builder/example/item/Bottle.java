package designpatterns.builder.example.item;

import designpatterns.builder.example.Packing;

public class Bottle implements Packing {
	@Override
	public String pack() {
		return "Bottle";
	}
}
