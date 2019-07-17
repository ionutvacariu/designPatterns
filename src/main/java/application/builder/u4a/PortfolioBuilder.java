package application.builder.u4a;

import java.util.ArrayList;

public class PortfolioBuilder {

	public Portfolio computeBilanciato() {
		Portfolio portfolio = new Portfolio();
		portfolio.setInstruments(new ArrayList<>());
		portfolio.getInstruments().add(new GT0Instrument());
		portfolio.getInstruments().add(new TigInstrument());
		return portfolio;
	}
}
