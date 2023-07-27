package org.Sujan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		list.add(new Data("Sushil"));
		list.add(new Data("Bikram"));
		list.add(new Data("Sandip"));

		Collections.sort(list, (Data o1, Data o2) -> {

			if(o1.getName().length() < o2.getName().length()) {
				return -1;
			} else if(o1.getName().length() > o2.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		});

		for (Data data : list) {
			System.out.println(data.getName());
		}

	}

}
