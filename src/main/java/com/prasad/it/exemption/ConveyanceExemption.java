package com.prasad.it.exemption;

public class ConveyanceExemption implements Exemption {

	private double conveyanceAlloeance;

	public ConveyanceExemption(double conveyanceAlloeance) {
		this.conveyanceAlloeance = conveyanceAlloeance;
	}

	public double getExemptionAmount() {
		return conveyanceAlloeance;
	}
}
