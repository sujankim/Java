package org.Sujan;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		{
			File file = new File("SudyEasy.txt");
			file.createNewFile();
			System.out.println("File created");
		}
	}

}
