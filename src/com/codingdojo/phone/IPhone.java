package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		String ringTone = getRingTone();
		return ringTone;
	}

	@Override
	public String unlock() {
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		System.out.println("IPhone Version: " + getVersionNumber() + ", Battery: " + getBatteryPercentage() + "%" + ", Carrier: " + getCarrier() + ", Ring Tone: " + getRingTone());

	}

}
