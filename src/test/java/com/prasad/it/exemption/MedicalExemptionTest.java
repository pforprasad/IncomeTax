package com.prasad.it.exemption;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedicalExemptionTest {


	/*
	 * Test for getting correct Medical Exemption.
	 */
	@Test
	public void testGetExemptionAmountPositive() {
		MedicalExemption exemption = new MedicalExemption(15000);
		assertEquals(15000, exemption.getExemptionAmount(), 0.0);
	}

	/*
	 * Test for getting incorrect Medical Exemption.
	 */
	@Test
	public void testGetExemptionAmountNegative() {
		MedicalExemption exemption = new MedicalExemption(200);
		assertFalse(100 == exemption.getExemptionAmount());
	}

}
