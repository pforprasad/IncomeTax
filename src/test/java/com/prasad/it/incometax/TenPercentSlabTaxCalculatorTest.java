package com.prasad.it.incometax;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenPercentSlabTaxCalculatorTest {
	
	/**
	 * Test for 10% tax eligibility on gross salary with eligible amount
	 */
	@Test
	public void testIsApplicableValidCase() {
		TenPercentSlabTaxCalculator calculator = new TenPercentSlabTaxCalculator(450000);
		assertTrue(calculator.isApplicable());
	}
	
	/**
	 * Test for 10% tax eligibility on gross salary with non eligible amount
	 */
	@Test
	public void testIsApplicableInvalidCase() {
		
		TenPercentSlabTaxCalculator calculator = new TenPercentSlabTaxCalculator(50000);
		assertFalse(calculator.isApplicable());
		
	}
	
	/**
	 * Test for getting tax for taxable salary.
	 */
	@Test
	public void testGetTaxForTaxableSalary() {
		TenPercentSlabTaxCalculator calculator = new TenPercentSlabTaxCalculator(500000);
		assertEquals(25000, calculator.getTax(0), 0.0);
	}
	
	/**
	 * Test for getting tax for non taxable salary.
	 */
	@Test
	public void testGetTaxForNonTaxableSalary() {
		TenPercentSlabTaxCalculator calculator = new TenPercentSlabTaxCalculator(50000);
		assertEquals(0, calculator.getTax(0), 0.0);
	}
}
