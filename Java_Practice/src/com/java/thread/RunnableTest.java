package com.java.thread;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableTest is running.");

	}

	public static void main(String[] args) {
		RunnableTest runth = new RunnableTest();
		Thread th = new Thread(runth);
		th.start();
	}

}
