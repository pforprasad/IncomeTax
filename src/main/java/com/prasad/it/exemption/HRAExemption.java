package com.prasad.it.exemption;

import com.prasad.it.exemption.hra.HouseRentAllowance;

public class HRAExemption implements Exemption {
    
    private HouseRentAllowance hra;

    public HRAExemption(HouseRentAllowance hra){
	this.hra = hra;
    }
    
    public double getExemptionAmount() {
	return hra.getExemption();
    }

}
