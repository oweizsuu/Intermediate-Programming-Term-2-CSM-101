import java.util.*;
public class W2A4Luzon {
	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		
		student.add("Alex");
		student.add("Bea");
		student.add("Carlo");
		
		System.out.println("student List: ");
		for (int i = 0; i < student.size(); i++) {
			System.out.println((i + 1) + ". " + student.get(i));
			
		}
		student.set(1,  "Bianca");
		System.out.println("\nAfter updating the second name: ");
		System.out.println(student);
		
		System.out.println("\nIs Carlo in the list? " + student.contains("Carlo"));
		
		
		
	}

}
