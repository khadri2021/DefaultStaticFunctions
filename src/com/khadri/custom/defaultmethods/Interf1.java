package com.khadri.custom.defaultmethods;

public interface Interf1 {

	public static final Double PI = 1.34;

	default void m1() {
		System.out.println("1 ltr petrol");
	}

}
