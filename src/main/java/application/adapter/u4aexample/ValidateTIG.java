package application.adapter.u4aexample;

public class ValidateTIG implements SecuritiesValidator {
	@Override
	public void validateTIG(Long ctv) {
		System.out.println("Validating TIG with ctv = "+ ctv);
	}

	@Override
	public void validateGT0(Long qta) {
		//doNothing
	}
}
