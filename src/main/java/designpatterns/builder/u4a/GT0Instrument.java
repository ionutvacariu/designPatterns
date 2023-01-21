package designpatterns.builder.u4a;

public class GT0Instrument implements Instrument {
	@Override
	public Long price() {
		return 5L;
	}

	@Override
	public String procCode() {
		return "GT0";
	}

	@Override
	public Long ctv() {
		return price() * qta();
	}

	@Override
	public Long qta() {
		return 1L;
	}
}
