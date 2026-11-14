import java.util.*;
public class W2A5Luzon {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		// 1. get() - access an item// 
		System.out.println("First fruits: " + fruits.get(0));
		
		// 2. set() - update an item
		fruits.set(1, "Orange");
		System.out.println("After set():" + fruits);
		
		// 3. contains() - check if an item exists
		System.out.println("Contains Banana? " + fruits.contains("Banana"));
		
		// 4. indexOf() - find the position of an item
		System.out.println("Index of Grapes" + fruits.indexOf("Graps"));
		
		
			
		
	}

}
