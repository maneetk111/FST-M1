package activities;
import java.util.*;

public class Activity9 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Orange");
		myList.add("Apple");
		myList.add("Peach");
		myList.add("Grape");
		myList.add(3,"Mango");
		
		System.out.println("Print all the list objects:");
		for(String item:myList) {
			System.out.println(item);
		}
		
		System.out.println("3rd element in the list: " + myList.get(3));
		System.out.println("Is Peach in the list: "+ myList.contains("Peach"));
		
		System.out.println("Size of Arraylist: " + myList.size());
		
		myList.remove("Grape");
		System.out.println("New size of Arraylist: " + myList.size());
		
	}

}
