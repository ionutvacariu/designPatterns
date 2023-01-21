package designpatterns.builder.u4a;

public class TigInstrument implements Instrument {
	@Override
	public Long price() {
		return 1L;
	}

	@Override
	public String procCode() {
		return "TIG";
	}

	@Override
	public Long ctv() {
		return price() * qta();
	}

	@Override
	public Long qta() {
		return 100L;
	}

}
