package com.prasad.it.incometax;

public class SurchargeCalculator extends AbstractIncomeTaxCalculator {

	private static double LOWER_LIMIT = 10000000;
	private double grossSalary;

	public SurchargeCalculator(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	@Override
	public Boolean isApplicable() {
		return (this.grossSalary > LOWER_LIMIT);
	}

	@Override
	public double getTax(double currentTax) {
		double surcharge = 0.0;
		if (isApplicable()) {
			surcharge = currentTax * 0.1;
		}
		return surcharge;
	}

}
