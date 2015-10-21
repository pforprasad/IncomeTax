package com.prasad.it.exemption.hra;

public class ActualHraRule implements HraExemptionRule {

    private HouseRentAllowance hra;

    public ActualHraRule(HouseRentAllowance hra) {
	this.hra = hra;
    }

    public double getExemption() {
	return this.hra.getHraAllowance();
    }

}
