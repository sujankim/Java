package org.Sujan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		{
			File file = new File("text");
			file.mkdir();
			file = new File("text\\team.txt");
			try {
				file.createNewFile();
				System.out.println("File Created");
			} catch (IOException e) {
				System.out.println("error occured, while creating the file");
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
				bw.write("Sujan");
				bw.newLine();
				bw.write("Sandip");
				bw.newLine();
				bw.write("Sushil");
				bw.newLine();
				bw.write("Bikram");
				System.out.println("Writing onto the file completed");
				bw.close();
				
			} catch (IOException e) {
				System.out.println("error occured, while creating writing onto file");
			}
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("text\\team.txt"));
				String line;
				System.out.println("*************");
				while((line = br.readLine())!=null) {
					System.out.println(line);
				}
				br.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("FieNotFoundExpection");
			} catch (IOException e) {
				System.out.println("IOException");
			}
			
		}
		

	}

}
