package com.prasad.it.exemption.hra;

import java.util.ArrayList;
import java.util.List;

public class HouseRentAllowance {

    private Boolean metro;
    private Double rentPaid;
    private Double basic;
    private Double hraAllowance;

    private List<HraExemptionRule> exemptionRules = new ArrayList<HraExemptionRule>();

    public HouseRentAllowance(Double basic, Double hraAllowance,
	    Double rentPaid, Boolean metro) {
	this.basic = basic;
	this.hraAllowance = hraAllowance;
	this.rentPaid = rentPaid;
	this.metro = metro;
	this.addRules();
    }

    private void addRules() {
	exemptionRules.add(new HraMetroRule(this));
	exemptionRules.add(new ActualHraRule(this));
	exemptionRules.add(new HraRentPaidRule(this));
    }

    public Boolean isMetro() {
	return metro;
    }

    public Double getRentPaid() {
	return rentPaid;
    }

    public Double getBasic() {
	return basic;
    }

    public Double getHraAllowance() {
	return hraAllowance;
    }

    public double getExemption() {
	if (exemptionRules.size() < 0)
	    return 0;
	double exemption = exemptionRules.get(0).getExemption();
	for (int i = 1; i < exemptionRules.size(); i++) {
	    exemption = Math.min(exemption, exemptionRules.get(i).getExemption());
	}
	return exemption;
    }
}
