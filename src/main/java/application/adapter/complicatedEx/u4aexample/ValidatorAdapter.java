package application.adapter.complicatedEx.u4aexample;

/**
 * SOLI D -- Dependency inversion -- better to have dependencies of interfaces that implementantions
 */
public class ValidatorAdapter implements ValidateFinancialInstruments {
	private SecuritiesValidator securitiesValidator;

	public ValidatorAdapter(String type) {

		if ("TIG".equalsIgnoreCase(type)) {
			securitiesValidator = new ValidateTIG();
		} else if ("GT0".equalsIgnoreCase(type)) {
			securitiesValidator = new ValidateGT0();
		} else
			throw new IllegalArgumentException("Cannot Validate this security type");

	}

	@Override
	public void validate(String productType, Long ctv) {
		if ("TIG".equalsIgnoreCase(productType)) {
			securitiesValidator.validateTIG(ctv);
		} else if ("GT0".equalsIgnoreCase(productType)) {
			final Long price = 2L;
			final Long qta = ctv / price;
			securitiesValidator.validateGT0(qta);
		}
	}
}
