package com.khadri.custom.staticmethods;

import java.util.ArrayList;

public interface Inter1 {

	public static void m1() {
		System.out.println("Hello");
	}
	 
	public static void main(String[] args) {
		System.out.println("I am from Inter1 main ");
		
		StaticMethodTest methodTest = new StaticMethodTest();
		
		methodTest.m1();
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Jeelan");
		arrayList.add("Vikram");
		arrayList.add("Babjan");
		
		System.out.println(arrayList);
		
		
		StaticMethodTest.main(new String[] {});
		
		
	}
	 
}
