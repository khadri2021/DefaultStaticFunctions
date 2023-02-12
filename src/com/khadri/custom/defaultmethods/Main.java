package com.khadri.custom.defaultmethods;

public class Main {

	public static void main(String[] args) {
		Interf1 interf1 = new TestImpl();
		interf1.m1();   
		
		Interf1 interf2 = new TestImpl2();
		interf2.m1();   
		
		
	}
}
