import java.util.*;
public class W2A6Luzon {
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		
		// I AND THE INITIAL SCORE //
		scores.add(85);
		scores.add(92);
		scores.add(78);
		scores.add(90);
		scores.add(88);
		
		// So if I put String in the first code the "add" is error. So I put integer to accept my "add"
		
			// 1. Get the total and CountAtleast\\
			int total = 0;
			int countAtleast85 = 0;
		
		// 2. Proceed to the for Loop// 
			for(int i = 0; i < scores.size(); i++) {
				int score = scores.get(i);
				total += score;
				if(score >= 85) {
					countAtleast85++;
				}
				
			}
		// 3. Get the double so you can have the Average\\
			double average = (double) total / scores.size();
			
		// 4. print out the final output\\
		System.out.println("Scores: " + scores);
		System.out.println("Total: " + total);
		System.out.println("Average " + average);
		System.out.println("Scores at least 85: " + countAtleast85);
		
	}

}
