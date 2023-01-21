package designpatterns.adapter.u4aexample;

/**
 * SOL   I  D -- Interface seggregation -- better to have specific interfaces than generic ones
 */
public interface ValidateFinancialInstruments {
	void validate(String productType, Long ctv);
}
