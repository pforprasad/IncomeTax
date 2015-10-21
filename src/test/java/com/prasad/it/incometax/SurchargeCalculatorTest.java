package com.prasad.it.incometax;

import static org.junit.Assert.*;

import org.junit.Test;

public class SurchargeCalculatorTest {
	
	/**
	 * Test for validating surcharge application.
	 */
	@Test
	public void testIsApplicableValidCase() {
		SurchargeCalculator surchargeCalculator = new SurchargeCalculator(11000000.00);
		assertTrue(surchargeCalculator.isApplicable());
	}
	
	/**
	 * Test for validating surcharge application.
	 */
	@Test
	public void testIsApplicableInvalidCase() {
		SurchargeCalculator surchargeCalculator = new SurchargeCalculator(1000000.00);
		assertFalse(surchargeCalculator.isApplicable());
	}
	
	
	
	/**
	 * Test for calculating surcharge application.
	 */
	@Test
	public void testGetTaxValidCase() {
		SurchargeCalculator surchargeCalculator = new SurchargeCalculator(11000000.00);
		assertEquals(4200, surchargeCalculator.getTax(42000.00), 0.0);
	}
	
	/**
	 * Test for calculating surcharge application where it is not applicable.
	 */
	@Test
	public void testGetTaxInvalideCase() {
		SurchargeCalculator surchargeCalculator = new SurchargeCalculator(00000.00);
		assertEquals(0, surchargeCalculator.getTax(42000.00), 0.0);
	}

}
