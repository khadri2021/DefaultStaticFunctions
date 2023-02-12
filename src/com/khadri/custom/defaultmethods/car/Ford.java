package com.khadri.custom.defaultmethods.car;

public class Ford implements CarInterface {

	@Override
	public void fly() {
		System.out.println("Ford Fly 200 Feet"); 
	}
	
	@Override
	public void floating() {
		System.out.println("floating speed 30km/h");
	}

}
