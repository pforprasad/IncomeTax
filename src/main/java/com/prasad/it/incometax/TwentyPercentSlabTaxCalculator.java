package com.prasad.it.incometax;

public class TwentyPercentSlabTaxCalculator extends AbstractIncomeTaxCalculator {

	private static double LOWER_LIMIT = 500000;
	private static double UPPER_LIMIT = 1000000;
	private double grossSalary;

	public TwentyPercentSlabTaxCalculator(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public Boolean isApplicable() {
		return (this.grossSalary > LOWER_LIMIT);
	}

	@Override
	public double getTax(double currentTax) {
		double tax = 0.0;
		if (this.grossSalary > UPPER_LIMIT) {
			tax = (UPPER_LIMIT - LOWER_LIMIT) * 0.2;
		} else if (this.grossSalary > LOWER_LIMIT) {
			tax = (this.grossSalary - LOWER_LIMIT) * 0.2;
		} else {
			tax = 0.0;
		}
		return tax;
	}

}
