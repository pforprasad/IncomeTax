package com.prasad.it.incometax;

public class ThirtyPercentSlabTaxCalculator extends AbstractIncomeTaxCalculator {

	private static double LOWER_LIMIT = 1000000;
	private double grossSalary;

	public ThirtyPercentSlabTaxCalculator(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public Boolean isApplicable() {
		return (this.grossSalary > LOWER_LIMIT);
	}

	@Override
	public double getTax(double currentTax) {
		double tax = 0.0;
		if (isApplicable()) {
			tax = (this.grossSalary - LOWER_LIMIT) * 0.3;
		}
		return tax;
	}

}
