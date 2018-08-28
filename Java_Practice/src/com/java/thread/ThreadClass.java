package com.java.thread;

public class ThreadClass extends Thread{
	
	@Override
	public void run(){
		System.out.println("ThreadClass is running");
	}

	public static void main(String[] args) {
		ThreadClass th = new ThreadClass();
		th.start();
	}
}
