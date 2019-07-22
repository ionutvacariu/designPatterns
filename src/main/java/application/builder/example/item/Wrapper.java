package application.builder.example.item;

import application.builder.example.Packing;

public class Wrapper implements Packing {
	@Override
	public String pack() {
		return "Wrapper";
	}
}
