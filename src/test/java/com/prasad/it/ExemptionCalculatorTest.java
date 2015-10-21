package com.prasad.it;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExemptionCalculatorTest {
	
	SalaryDetails salaryDetails;
	
	@Before
	public void setUp() throws Exception {
		salaryDetails = new SalaryDetails(); 
		salaryDetails.setBasic(200000);
		salaryDetails.setCarAllowance(96000);
		salaryDetails.setConveyanceAlloeance(19200);
		salaryDetails.setEmployerContributionToPf(36000);
		salaryDetails.setFestivalAllowance(5000);
		salaryDetails.setHouseRent(120000);
		salaryDetails.setHouseRentAllowance(120000);
		salaryDetails.setLta(50000);
		salaryDetails.setMedical(15000);
		salaryDetails.setMetroArea(false);
		salaryDetails.setSpecialAllowance(400000);
	}
	
	/**
	 * calcualte exemptions for the non metro area.
	 */
	@Test
	public void testGetNetExemptionsForNonMetroArea() {
		ExemptionCalculator calculator = new ExemptionCalculator(salaryDetails);
		assertEquals(114200.0, calculator.getNetExemptions(), 0.0);
	}
	
	
	/**
	 * calcualte exemptions for the metro area.
	 */
	@Test
	public void testGetNetExemptionsForMetroArea() {
		salaryDetails.setMetroArea(true);
		ExemptionCalculator calculator = new ExemptionCalculator(salaryDetails);
		assertEquals(134200, calculator.getNetExemptions(), 0.0);
	}

}
