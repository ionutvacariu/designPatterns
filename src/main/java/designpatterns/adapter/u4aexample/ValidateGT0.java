package designpatterns.adapter.u4aexample;

public class ValidateGT0 implements SecuritiesValidator {

	@Override
	public void validateTIG(Long ctv) {
		//doNothing
	}

	@Override
	public void validateGT0(Long qta) {
		if (qta > 0) {
			System.out.println("Validating GT0 with qta = " + qta);
		}
	}
}
