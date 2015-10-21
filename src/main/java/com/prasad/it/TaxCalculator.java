/**
 * 
 */
package com.prasad.it;

import com.prasad.it.incometax.EducationCessDecorator;
import com.prasad.it.incometax.SurchargeCalculator;
import com.prasad.it.incometax.TenPercentSlabTaxCalculator;
import com.prasad.it.incometax.ThirtyPercentSlabTaxCalculator;
import com.prasad.it.incometax.TwentyPercentSlabTaxCalculator;

/**
 * @author PR012CH
 *
 */
public class TaxCalculator {

    private double grossSalary;

    public TaxCalculator(double grossSalary) {
	this.grossSalary = grossSalary;
    }

    public double computeTax() {

	TenPercentSlabTaxCalculator tenPercentSlabTaxCalculator = new TenPercentSlabTaxCalculator(grossSalary);
	TwentyPercentSlabTaxCalculator twentyPercentSlabTaxCalculator = new TwentyPercentSlabTaxCalculator(grossSalary);
	ThirtyPercentSlabTaxCalculator thirtyPercentSlabTaxCalculator = new ThirtyPercentSlabTaxCalculator(grossSalary);
	SurchargeCalculator surchargeCalculator = new SurchargeCalculator(grossSalary);
	tenPercentSlabTaxCalculator.setNext(twentyPercentSlabTaxCalculator);
	twentyPercentSlabTaxCalculator.setNext(thirtyPercentSlabTaxCalculator);
	thirtyPercentSlabTaxCalculator.setNext(surchargeCalculator);

	double compute = new EducationCessDecorator(tenPercentSlabTaxCalculator).compute(0);
	
	return compute;
    }

}
