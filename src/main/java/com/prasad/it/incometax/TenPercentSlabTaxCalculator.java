/**
 * 
 */
package com.prasad.it.incometax;

/**
 * @author PR012CH
 *
 */
public class TenPercentSlabTaxCalculator extends AbstractIncomeTaxCalculator {

	private static double LOWER_LIMIT = 250000;
	private static double UPPER_LIMIT = 500000;
	private double grossSalary;

	public TenPercentSlabTaxCalculator(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public Boolean isApplicable() {
		return (this.grossSalary > LOWER_LIMIT && this.grossSalary <= UPPER_LIMIT);
	}

	@Override
	public double getTax(double currentTax) {
		double tax;
		if (this.grossSalary > UPPER_LIMIT) {
			tax = (UPPER_LIMIT - LOWER_LIMIT) * 0.1;
		} else if (this.grossSalary > LOWER_LIMIT) {

			tax = (this.grossSalary - LOWER_LIMIT) * 0.1;
		} else {
			tax = 0.0;
		}
		return tax;
	}
}
