package com.prasad.it;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IncomeTaxCalculatorServiceTest {

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
		salaryDetails.setMetroArea(true);
		salaryDetails.setSpecialAllowance(400000);
	}

	/**
	 * Test calculating net tax for the metro area member.
	 */
	@Test
	public void testCalculateTaxForMetroArea() {
		IncomeTaxCalculatorService service = new IncomeTaxCalculatorService();
		assertEquals(88992.0, service.calculateTax(salaryDetails), 0.0);
	}

	/**
	 * Test calculating net tax for the metro area member.
	 */
	@Test
	public void testCalculateTaxForNonMetroArea() {
		salaryDetails.setMetroArea(false);
		IncomeTaxCalculatorService service = new IncomeTaxCalculatorService();
		assertEquals(93112.0, service.calculateTax(salaryDetails), 0.0);
	}

}
