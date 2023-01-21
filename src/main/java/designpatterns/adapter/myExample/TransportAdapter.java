package designpatterns.adapter.myExample;

public class TransportAdapter implements Transport {
	private SpecialTransport specialTransport;

	public TransportAdapter(String type) {
		if ("Gas".equalsIgnoreCase(type)) {
			specialTransport = new TransportGas();

		} else if ("BigHouse".equalsIgnoreCase(type)) {
			specialTransport = new TransportBigHouse();
		}

	}

	@Override
	public void transport(String type, String trasee) {
		if ("Gas".equalsIgnoreCase(type)) {
			specialTransport.transportGas(trasee);

		} else if ("BigHouse".equalsIgnoreCase(type)) {
			specialTransport.transportBigHouse(trasee);
		}


	}
}
