/**
 * 
 */
package com.prasad.it;

/**
 * @author PR012CH
 *
 */
public class IncomeTaxCalculatorService {

    public double calculateTax(SalaryDetails salaryDetails) {

	// calculate total salary
	double totalSalary = calcualteTotalSalary(salaryDetails);

	// Calculate total exemptions.
	double netExemptions = new ExemptionCalculator(salaryDetails).getNetExemptions();
	
	// Calculate total tax
	double netTax = new TaxCalculator(totalSalary - netExemptions).computeTax();

	return netTax;
    }

    private double calcualteTotalSalary(SalaryDetails salaryDetails) {

    	
    /**
     * Calculate total salary. Which is sum of components 
     * excluding employer's PF and untaxable components.
     */
	double totalSalary = salaryDetails.getBasic()
		+ salaryDetails.getEmployerContributionToPf()
		+ salaryDetails.getHouseRentAllowance()
		+ salaryDetails.getConveyanceAlloeance()
		+ salaryDetails.getLta() + salaryDetails.getSpecialAllowance()
		+ salaryDetails.getMedical() + salaryDetails.getCarAllowance()
		+ salaryDetails.getFestivalAllowance();

	return totalSalary;

    }

}
