package application.adapter.complicatedEx.myExample;

public class TransportBigHouse implements SpecialTransport{
	@Override
	public void transportGas(String location) {
		//doNothing
	}

	@Override
	public void transportBigHouse(String location) {
		System.out.println("Transport big house from x to y");
	}
}
