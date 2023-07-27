package org.Sujan;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		/*{
		File directory = new File("studyEasy");
		directory.mkdir();
		System.out.println("directory created");
		}*/
		
		{
		File directory = new File("studyEasy\\author\\Sujan");
		directory.mkdirs();
		System.out.println("directory created");
		File file = new File("studyEasy\\\\author\\\\Sujan\\test.txt");
		file.createNewFile();
		System.out.println("File Created");
		}
		

	}

}
