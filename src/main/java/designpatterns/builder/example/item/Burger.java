package designpatterns.builder.example.item;

import designpatterns.builder.example.Item;
import designpatterns.builder.example.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing(){
		return new Wrapper();
	}

	/*@Override
	public abstract float price();*/
}
