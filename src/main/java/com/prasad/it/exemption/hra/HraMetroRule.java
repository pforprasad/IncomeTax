package com.prasad.it.exemption.hra;

public class HraMetroRule implements HraExemptionRule {

    private HouseRentAllowance hra;

    public HraMetroRule(HouseRentAllowance hra) {
	this.hra = hra;
    }

    
    public double getExemption() {
	
	double hraExemption = 0.0;
	
	if (hra.isMetro()) {
	    hraExemption = this.hra.getBasic() * 0.5;
	} else {
	    hraExemption = this.hra.getBasic() * 0.4;
	}

	return hraExemption;
    }

}
