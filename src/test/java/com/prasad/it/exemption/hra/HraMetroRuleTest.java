package com.prasad.it.exemption.hra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HraMetroRuleTest {

	/**
	 * Test for calculating HRA exemption for non-metro area.
	 */
	@Test
	public void testGetExemptionForNonMetroPositive(){
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00, 7500.00, new Boolean(false));
		HraMetroRule hraMetroRule = new HraMetroRule(hra);
		assertEquals(4800.00, hraMetroRule.getExemption(), 0.00);
	}
	
	
	
	/**
	 * Test for calculating HRA exemption for metro area.
	 */
	@Test
	public void testGetExemptionForMetroPositive(){
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00, 7500.00, new Boolean(true));
		HraMetroRule hraMetroRule = new HraMetroRule(hra);
		assertEquals(6000.00, hraMetroRule.getExemption(), 0.00);
	}
	
}
