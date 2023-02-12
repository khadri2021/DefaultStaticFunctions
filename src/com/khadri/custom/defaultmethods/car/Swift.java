package com.khadri.custom.defaultmethods.car;

public class Swift implements CarInterface {

	@Override
	public void fly() {
		System.out.println("Swift Fly 100 Feet"); 
	}
	
	@Override
	public void floating() {
		CarInterface.super.floating();
	}

}
