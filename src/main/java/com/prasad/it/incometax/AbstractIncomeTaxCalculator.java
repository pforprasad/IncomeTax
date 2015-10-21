/**
 * 
 */
package com.prasad.it.incometax;

/**
 * @author PR012CH
 *
 */
public abstract class AbstractIncomeTaxCalculator {

    private AbstractIncomeTaxCalculator nextInChain;

    public void setNext(AbstractIncomeTaxCalculator nextInChain) {
	this.nextInChain = nextInChain;
    }

    public double compute(double currentTax) {
	double tax=currentTax; 
	tax += getTax(currentTax);
	if (nextInChain != null &&  nextInChain.isApplicable())
	    return nextInChain.compute(tax);
	else
	    return tax ;

    }

    public abstract Boolean isApplicable();

    public abstract double getTax(double currentTax);

}
