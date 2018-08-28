package com.java.dp;

/**
 * @author Sudhir Kumar
 *
 */
public class PhoneBuilder {

	private String os;
	private String processor;
	private double screenSize;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	/**
	 * @return Phone Object
	 */
	public Phone buildPhone(){
		return new Phone(os, processor, screenSize, battery);
	}
}
