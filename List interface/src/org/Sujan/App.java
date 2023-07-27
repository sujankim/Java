package org.Sujan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("Nepal");
		countries.add("China");
		countries.add("USA");
		countries.add("India");
		countries.add("UK");

		new App().printList(countries);
		
		List<String> demo = new ArrayList<>();
		demo.add("one");
		demo.add("two");
		demo.add("three");
		demo.add("four");
		new App().printList(demo);
	}

	void printList(List<String> list) {
		for (String element : list) {
			System.out.println("Elements: " + element);
		}
		System.out.println("***************");
	}

}
