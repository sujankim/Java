package org.Sujan;

public class App {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("I am inside the thread 1");
			System.out.println("This is the line 2");
		}).start();
		;

	}

}
