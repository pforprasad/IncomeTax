package com.prasad.it;

import java.util.ArrayList;
import java.util.List;

import com.prasad.it.exemption.ConveyanceExemption;
import com.prasad.it.exemption.Exemption;
import com.prasad.it.exemption.HRAExemption;
import com.prasad.it.exemption.MedicalExemption;
import com.prasad.it.exemption.hra.HouseRentAllowance;

public class ExemptionCalculator {

	private List<Exemption> exemptions;

	public ExemptionCalculator(SalaryDetails salaryDetails) {
		exemptions = new ArrayList<Exemption>();
		HouseRentAllowance hra = new HouseRentAllowance(
				salaryDetails.getBasic(),
				salaryDetails.getHouseRentAllowance(),
				salaryDetails.getHouseRent(), salaryDetails.isMetroArea());
		this.exemptions.add(new HRAExemption(hra));
		this.exemptions.add(new ConveyanceExemption(salaryDetails.getConveyanceAlloeance()));
		this.exemptions.add(new MedicalExemption(salaryDetails.getMedical()));
	}

	public double getNetExemptions() {
		double totalExemption = 0.0;
		for (Exemption exemption : exemptions) {
			totalExemption += exemption.getExemptionAmount();
		}
		return totalExemption;
	}

}
