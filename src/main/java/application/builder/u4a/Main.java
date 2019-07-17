package application.builder.u4a;

public class Main {

	public static void main(String[] args) {
		PortfolioBuilder builder = new PortfolioBuilder();

		final Portfolio portfolio = builder.computeBilanciato();
		portfolio.listCtv();
	}
}
