package com.prasad.it.exemption.hra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HouseRentAllowanceTest {

	/**
	 * Test for calculating exact HRA exemption after finding minimum of all HRA
	 * rules for non metro area
	 *  Actual HRA rule eligibility 7500 
	 *  Actual rent paid rule eligibility 6300 
	 *  metro area rent rule eligibility 4800 
	 *  
	 *  Excepted result 4800 since that is min of all.
	 */
	@Test
	public void testGetExemptionForNonMetroArea() {
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00,
				7500.00, new Boolean(false));
		assertEquals(4800.00, hra.getExemption(), 0.00);
	}

	/**
	 * Test for calculating exact HRA exemption after finding minimum of all HRA
	 * rules for non metro area
     *  Actual HRA rule eligibility 7500 
	 *  Actual rent paid rule eligibility 6300 
	 *  metro area rent rule eligibility 6000 
	 *  
	 *  Excepted result 6000 since that is min of all.
	 */
	@Test
	public void testGetExemptionForMetroArea() {
		HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00,
				7500.00, new Boolean(true));
		assertEquals(6000.00, hra.getExemption(), 0.00);
	}
}
