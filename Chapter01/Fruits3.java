package org.packt.selenium;

import java.util.Arrays;
import java.util.List;

public class Fruits3 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apples", "Oranges", "Bananas",
				"Pears");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		fruits.forEach(i -> System.out.println(i));
	}
}
