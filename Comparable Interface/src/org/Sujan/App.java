package org.Sujan;

import java.util.*;

class Names{
	private String name;

	public Names(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}



public class App {

	public static void main(String[] args) {

		List<Object> elements = new LinkedList<>();
		elements.add(new Names("Sujan"));
		elements.add(new Names("Sushil"));
		elements.add(new Names("Sandip"));
		elements.add("Some String");
		elements.add(1);
		elements.add(2.0);
		elements.add("#");

		App app = new App();
		app.printList(elements);

	}

	void printList(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
