package com.prasad.it.exemption.hra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class ActualHraRuleTest {

    ActualHraRule actualHraRule;

    @Before
    public void setUp() {
	HouseRentAllowance hra = new HouseRentAllowance(12000.00, 8000.00, 8000.00, new Boolean(false));
	actualHraRule = new ActualHraRule(hra);
    }
    
    /*
     * Test  actual HRA exemption is as HRA.
     */
    @Test
    public void testGetExemptionPositive() {
	assertEquals(8000.00, actualHraRule.getExemption(), 0.00);
    }
    
    /*
     * Test actual HRA is not equals to HRA exemption 
     */
    @Test
    public void testGetExemptionNegative() {
	assertFalse(9000.00 == actualHraRule.getExemption());
    }
}
