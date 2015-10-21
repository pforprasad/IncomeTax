package com.prasad.it.exemption;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.prasad.it.exemption.hra.HouseRentAllowance;

public class HRAExemptionTest {

	@Test
	public void testGetExemptionAmountForNonMetro() {
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00,7500.00, new Boolean(false));
		HRAExemption exemption = new HRAExemption(hra);
		assertEquals(4800, exemption.getExemptionAmount(), 0.0);
	}
	
	
	@Test
	public void testGetExemptionAmountForZeroHRA() {
		
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 0.00, 7500.00, new Boolean(false));
		HRAExemption exemption = new HRAExemption(hra);
		assertEquals(0.0, exemption.getExemptionAmount(), 0.0);
	}
	
	
	@Test
	public void testGetExemptionAmountForMetroArea() {
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00, 7500.00, new Boolean(true));
		HRAExemption exemption = new HRAExemption(hra);
		assertEquals(6000.0, exemption.getExemptionAmount(), 0.0);
	}
}
