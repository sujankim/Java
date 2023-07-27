package org.Sujan;

import java.util.*;

class Data {
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class App {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Sujan"));
		list.add(new Data("Sandip"));
		list.add(new Data("Sushil"));
		list.add(new Data("Bikram"));

		/*
		 * for(Integer i: list) { if(i>=10) { System.out.println(i); } }
		 */

		list.forEach(temp -> {

			System.out.println(temp.getName());

		});
	}

}
