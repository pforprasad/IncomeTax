package com.prasad.it.exemption;

public class MedicalExemption implements Exemption {

	private double medical;

	public MedicalExemption(double medical) {
		this.medical = medical;
	}

	public double getExemptionAmount() {
		return this.medical;
	}

}
