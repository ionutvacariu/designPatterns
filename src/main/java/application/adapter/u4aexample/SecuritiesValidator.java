package application.adapter.u4aexample;

/**
 * SOL   I  D -- Interface seggregation -- better to have specific interfaces than generic ones
 *
 */
public interface SecuritiesValidator {
	void validateTIG(Long ctv);
	void validateGT0(Long qta);
}
