package org.Sujan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9765);
		Vehicle car = new Vehicle("car", 9646);
		
		
		try(FileOutputStream fos = new FileOutputStream("studyeasy\\vehicles.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the file");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundExecption");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}
	}

}
