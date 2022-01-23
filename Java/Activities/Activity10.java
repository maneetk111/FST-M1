package activities;
import java.util.*;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Samsung");
		hs.add("Apple");
		hs.add("Redmi");
		hs.add("Oppo");
		hs.add("Vivo");
		
		System.out.println("Original HashSet: " + hs);
		
		System.out.println("Size of HashSet: " + hs.size());
		
		System.out.println("Removing Redmi from HashSet: " + hs.remove("Redmi"));
        //Remove element that is not present
        if(hs.remove("Indigo")) {
        	System.out.println("Indigo removed from the Set");
        } else {
        	System.out.println("Indigo is not present in the Set");
        }
		
		System.out.println("Is Oppo in the list: "+ hs.contains("Oppo"));
		
		System.out.println("Updated HashSet: " + hs);	
	}

}
