package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable {
	
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

	@Override
	public String ring() {
		String ringTone = getRingTone();
		return ringTone;
	}

	@Override
	public String unlock() {
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy Version: " + getVersionNumber() + ", Battery: " + getBatteryPercentage() + "%" + ", Carrier: " + getCarrier() + ", Ring Tone: " + getRingTone());

	}

}
