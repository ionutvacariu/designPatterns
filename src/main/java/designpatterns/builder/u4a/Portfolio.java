package designpatterns.builder.u4a;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
	private List<Instrument> instruments = new ArrayList<>();

	public void listCtv() {
		Long ctvPtf = 0L;
		for (Instrument instrument : instruments) {
			ctvPtf += instrument.ctv();
		}
		System.out.println(ctvPtf);
	}

	public void listPrices() {
		for (Instrument instrument : instruments) {
			System.out.println(" instrument price = " + instrument.ctv());
		}
	}

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}
}
