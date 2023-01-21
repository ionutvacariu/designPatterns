package designpatterns.adapter.u4aexample;

public class Main {
	public static void main(String[] args) {
		ValidateFinancialInstruments validateFinancialInstruments = new ValidateFinancialInstrumentsImpl();

		validateFinancialInstruments.validate("BIN", 20L);
		validateFinancialInstruments.validate("TIG", 20L);
		validateFinancialInstruments.validate("GT0", 20L);
		validateFinancialInstruments.validate("PRODUCT_TYPE", 20L);

	}
}
