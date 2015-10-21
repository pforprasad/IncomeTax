package com.prasad.it.incometax;

import static org.junit.Assert.*;

import org.junit.Test;

public class EducationCessDecoratorTest {
	
	/**
	 * Test for calculating cess and tax for the salary
	 */
	@Test
	public void testGetTaxForWithCess() {
		TenPercentSlabTaxCalculator  slabTaxCalculator = new TenPercentSlabTaxCalculator(500000);
		EducationCessDecorator cessDecorator = new EducationCessDecorator(slabTaxCalculator);
		assertEquals(25750.00,cessDecorator.getTax(0),0.0);
	}
	
	/**
	 * calculate cess and tax for non taxable salary
	 */
	@Test
	public void testGetTaxForNonTableSalary() {
		TenPercentSlabTaxCalculator  slabTaxCalculator = new TenPercentSlabTaxCalculator(50000);
		EducationCessDecorator cessDecorator = new EducationCessDecorator(slabTaxCalculator);
		assertEquals(00.00,cessDecorator.getTax(0),0.0);
	}

}
