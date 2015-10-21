package com.prasad.it.incometax;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwentyPercentSlabTaxCalculatorTest {

	/**
	 * Test for 20% tax eligibility on gross salary with eligible amount
	 */
	@Test
	public void testIsApplicableValidCase() {
		TwentyPercentSlabTaxCalculator calculator = new TwentyPercentSlabTaxCalculator(800000);
		assertTrue(calculator.isApplicable());
	}
	
	/**
	 * Test for 20% tax eligibility on gross salary with non eligible amount
	 */
	@Test
	public void testIsApplicableInvalidCase() {
		
		TwentyPercentSlabTaxCalculator calculator = new TwentyPercentSlabTaxCalculator(500000);
		assertFalse(calculator.isApplicable());
		
	}
	
	/**
	 * Test for getting tax for taxable salary.
	 */
	@Test
	public void testGetTaxForTaxableSalary() {
		TwentyPercentSlabTaxCalculator calculator = new TwentyPercentSlabTaxCalculator(1000000);
		assertEquals(100000, calculator.getTax(0), 0.0);
	}
	
	/**
	 * Test for getting tax for non taxable salary.
	 */
	@Test
	public void testGetTaxForNonTaxableSalary() {
		TwentyPercentSlabTaxCalculator calculator = new TwentyPercentSlabTaxCalculator(410000);
		assertEquals(0, calculator.getTax(0), 0.0);
	}
}
