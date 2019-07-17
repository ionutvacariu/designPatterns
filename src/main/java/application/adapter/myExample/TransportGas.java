package application.adapter.myExample;

public class TransportGas implements SpecialTransport{

	@Override
	public void transportGas(String location) {
		System.out.println("transporting gas from x to y");
	}

	@Override
	public void transportBigHouse(String location) {
		//doNothing
	}
}
