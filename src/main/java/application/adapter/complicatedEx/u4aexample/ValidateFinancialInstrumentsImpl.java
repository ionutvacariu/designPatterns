package application.adapter.complicatedEx.u4aexample;

import java.util.ArrayList;
import java.util.List;

public class ValidateFinancialInstrumentsImpl implements ValidateFinancialInstruments {
	private ValidatorAdapter validatorAdapter;
	private static List<String> securitiesType = new ArrayList<>();

	static {
		securitiesType.add("TIG");
		securitiesType.add("GT0");
	}

	@Override
	public void validate(String productType, Long ctv) {
		if (productType.equalsIgnoreCase("BIN")) {
			System.out.println("validating BIN with ctv = " + ctv);
		} else if (securitiesType.contains(productType)) {
			validatorAdapter = new ValidatorAdapter(productType);
			validatorAdapter.validate(productType, ctv);
		}
		else
			System.out.println("CANNOT VALIDATE " + productType);
	}
}
