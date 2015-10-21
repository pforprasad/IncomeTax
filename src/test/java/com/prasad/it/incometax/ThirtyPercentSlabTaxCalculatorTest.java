package com.prasad.it.incometax;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThirtyPercentSlabTaxCalculatorTest {

	/**
	 * Test for 30% tax eligibility on gross salary with eligible amount
	 */
	@Test
	public void testIsApplicableValidCase() {
		ThirtyPercentSlabTaxCalculator calculator = new ThirtyPercentSlabTaxCalculator(1500000);
		assertTrue(calculator.isApplicable());
	}
	
	/**
	 * Test for 30% tax eligibility on gross salary with non eligible amount
	 */
	@Test
	public void testIsApplicableInvalidCase() {
		
		ThirtyPercentSlabTaxCalculator calculator = new ThirtyPercentSlabTaxCalculator(500000);
		assertFalse(calculator.isApplicable());
		
	}
	
	/**
	 * Test for getting tax for taxable salary.
	 */
	@Test
	public void testGetTaxForTaxableSalary() {
		ThirtyPercentSlabTaxCalculator calculator = new ThirtyPercentSlabTaxCalculator(2500000);
		assertEquals(450000, calculator.getTax(125000), 0.0);
	}
	
	/**
	 * Test for getting tax for non taxable salary.
	 */
	@Test
	public void testGetTaxForNonTaxableSalary() {
		ThirtyPercentSlabTaxCalculator calculator = new ThirtyPercentSlabTaxCalculator(510000);
		assertEquals(0, calculator.getTax(27000), 0.0);
	}

}
