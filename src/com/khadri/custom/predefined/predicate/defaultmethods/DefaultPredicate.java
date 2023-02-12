package com.khadri.custom.predefined.predicate.defaultmethods;

import java.util.function.Function;
import java.util.function.Predicate;

public class DefaultPredicate {

	public static void main(String[] args) {

		Predicate<String> predicate1 = (str) -> {
			return !str.isEmpty();
		};

		predicate1.test("");

		Predicate<String> predicate2 = (str) -> {
			return str.endsWith("RI");
		};

		predicate2.test("KHADRI");
	 

		Predicate<String> result = predicate1.and(predicate2);

		System.out.println(result);

	}

}
