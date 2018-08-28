package com.java.dp;

/**
 * @author Sudhir Kumar
 *
 */
public class Phone {

	private String os;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String os, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize="
				+ screenSize + ", battery=" + battery + "]";
	}
	
	/**
	 * @return Phone Object
	 */
	public Phone getClone(){
		return new Phone(os, processor, screenSize, battery);	
	}
}
