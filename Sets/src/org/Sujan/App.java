package org.Sujan;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Sujan");
		set.add("Sushil");
		set.add("Sandip");
		set.add("Sujan");
		
		for(String name: set) {
			System.out.println(name);
		}
		
		System.out.println(set.contains("Sujan"));
	}

}
