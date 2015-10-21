package com.prasad.it;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TaxCalculatorTest {

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
	 * Test calculating net tax for non taxable income.
	 */
	@Test
	public void testCalculateTaxForNonTaxableIncome() {
		TaxCalculator service = new TaxCalculator(30000);
		assertEquals(0.0, service.computeTax(), 0.0);
	}

	/**
	 * Test calculating net tax under 10 % slab income.
	 */
	@Test
	public void testCalculateTaxForTenPercentSlab() {
		TaxCalculator service = new TaxCalculator(300000);
		assertEquals(5150.0, service.computeTax(), 0.0);
	}
	
	/**
	 * Test calculating net tax under 10 % slab income.
	 */
	@Test
	public void testCalculateTaxForTwentyPercentSlab() {
		TaxCalculator service = new TaxCalculator(900000);
		assertEquals(108150.0, service.computeTax(), 0.0);
	}
	
	/**
	 * Test calculating net tax under 10 % slab income.
	 */
	@Test
	public void testCalculateTaxForThirtyPercentSlab() {
		TaxCalculator service = new TaxCalculator(1500000);
		assertEquals(283250.0, service.computeTax(), 0.0);
	}
}
