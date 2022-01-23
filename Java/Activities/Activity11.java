package activities;
import java.util.*;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer,String> colours = new HashMap<>();
		colours.put(1, "Violet");
		colours.put(2, "Green");
		colours.put(3, "Yellow");
		colours.put(4, "Orange");
		colours.put(5, "Black");
		
		System.out.println("Original HashMap: " + colours);		
		colours.remove(3);
		System.out.println("Updated HashMap: " + colours);	        		
		System.out.println("Is Green in the list: "+ colours.containsValue("Green"));
		System.out.println("Size of HashMap: " + colours.size());	        	
		
	}

}
