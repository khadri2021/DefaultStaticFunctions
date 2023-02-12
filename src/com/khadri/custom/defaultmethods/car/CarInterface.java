package com.khadri.custom.defaultmethods.car;

public interface CarInterface {

	public abstract void fly();
	
	default void floating() {
		System.out.println("floating speed 10km/h");
	}
	
}
