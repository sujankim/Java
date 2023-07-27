import java.util.*;

public class Main {

	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
		listNames.add("Sujan");
		listNames.add("Sushil");
		listNames.add("Sandip");
		listNames.add("Bikram");
		listNames.add("Rohit");
		Main main = new Main();
		main.displayList(listNames);
		/*
		 * main.removeNameByPosition(0); System.out.println("*****");
		 * main.removeNameByString("Sandip"); main.displayList(listNames);
		 * System.out.println(listNames.get(3));
		 */
		
		main.displayList(listNames);
		System.out.println("***********");
		main.modifyName(3, "Rajesh");
		main.displayList(listNames);
		int position = main.search("Sujan");
		if(position != -1) {
			main.modifyName(position, "Sushil");
			main.displayList(listNames);
		}else {
			System.out.println("Invalid entry");
		}
	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	void removeNameByPosition(int position) {
		listNames.remove(position);
	}

	void removeNameByString(String name) {
		listNames.remove(name);
	}
	
	void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	
	int search(String name) {
		return listNames.indexOf(name);
	}
	
}
