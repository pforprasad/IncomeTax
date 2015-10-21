package com.prasad.it.exemption;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConveyanceExemptionTest {

	/*
	 * Test for getting correct Conveyance Exemption.
	 */
	@Test
	public void testGetExemptionAmountPositive() {
		ConveyanceExemption exemption = new ConveyanceExemption(19200);
		assertEquals(19200, exemption.getExemptionAmount(), 0.0);
	}

	/*
	 * Test for getting incorrect Conveyance Exemption.
	 */
	@Test
	public void testGetExemptionAmountNegative() {
		ConveyanceExemption exemption = new ConveyanceExemption(200);
		assertFalse(100 == exemption.getExemptionAmount());
	}
}
