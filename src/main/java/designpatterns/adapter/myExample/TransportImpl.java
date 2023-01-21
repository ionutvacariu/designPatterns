package designpatterns.adapter.myExample;

public class TransportImpl implements Transport {

	@Override
	public void transport(String type, String trasee) {
		if (type.equalsIgnoreCase("person")) {
			System.out.println("transporting persons from x to y");
		} else if (type.equalsIgnoreCase("Gas") || type.equalsIgnoreCase("BigHouse")) {
			TransportAdapter t = new TransportAdapter(type);
			t.transport(type, trasee);
		}
	}
}
