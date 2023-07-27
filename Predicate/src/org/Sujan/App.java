package org.Sujan;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {

		IntPredicate lessThan18 = i-> i<18;
		IntPredicate moreThan10 = i-> i>10;
		
		System.out.println(lessThan18.and(moreThan10).test(12));
	}
}
