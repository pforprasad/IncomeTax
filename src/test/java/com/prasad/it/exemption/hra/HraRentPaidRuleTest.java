package com.prasad.it.exemption.hra;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HraRentPaidRuleTest {

	
	
	HraRentPaidRule hraRentPaidRule;

    @Before
    public void setUp() {
	HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00, 7500.00, new Boolean(false));
	hraRentPaidRule = new HraRentPaidRule(hra);
    }
    
    /*
     * Test  actual HRA exemption is as HRA.
     */
    @Test
    public void testGetExemptionPositive() {
	assertEquals(6300.00, hraRentPaidRule.getExemption(), 0.00);
    }
    
    /*
     * Test actual HRA is not equals to HRA exemption 
     */
    @Test
    public void testGetExemptionNegative() {
	assertFalse(9000.00 == hraRentPaidRule.getExemption());
    }
    
    

}
