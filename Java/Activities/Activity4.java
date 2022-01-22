package activities;
import java.util.*;
public class Activity4 {
	public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println("Orginal array: "+ Arrays.toString(data));
        int size = data.length;
        
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && key < data[j]) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(data));
        System.out.println();
    }

}
