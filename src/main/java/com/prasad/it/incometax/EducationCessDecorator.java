package com.prasad.it.incometax;

public class EducationCessDecorator extends AbstractIncomeTaxCalculator {

    private AbstractIncomeTaxCalculator slabTaxCalculator;

    public EducationCessDecorator(AbstractIncomeTaxCalculator slabTaxCalculator) {
	this.slabTaxCalculator = slabTaxCalculator;
    }

    @Override
    public Boolean isApplicable() {
	return true;
    }

    @Override
    public double getTax(double currentTax) {
	double tax = slabTaxCalculator.compute(0);
	return tax + tax * 0.03;
    }

}
