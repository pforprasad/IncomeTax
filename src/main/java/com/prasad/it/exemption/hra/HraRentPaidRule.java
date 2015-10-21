package com.prasad.it.exemption.hra;

public class HraRentPaidRule implements HraExemptionRule {

    private HouseRentAllowance hra;

    public HraRentPaidRule(HouseRentAllowance hra) {
	this.hra = hra;
    }

    public double getExemption() {
	return  this.hra.getRentPaid() - (this.hra.getBasic() * 0.1);
    }
}
