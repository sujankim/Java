package org.Sujan;

// ()-> this symbol is called as arrow token

interface Lamda {
	abstract public int demo();
}

public class App {

	public static void main(String[] args) {
		Lamda lamda = () -> {
			System.out.println("We will return something");
			return 10;
		};
		System.out.println(lamda.demo()); 
	}

}
