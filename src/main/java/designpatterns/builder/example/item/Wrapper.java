package designpatterns.builder.example.item;

import designpatterns.builder.example.Packing;

public class Wrapper implements Packing {
	@Override
	public String pack() {
		return "Wrapper";
	}
}
