import java.util.*;

public class W2e2Luzon {
	public static void main(String[] args) {
		
		int[][] Luzon = {
				{0, 1, 1, 0},
	            {1, 1, 0, 0},
	            {0, 0, 1, 1},
	            {1, 1, 1, 1}
		};
		
		 	int Luzon_totalZeros = 0;
	        int Luzon_totalOnes = 0;
	        int Luzon_highestOnes = 0;
	        int Luzon_bestRow = 0;
	        
	        for (int i = 0; i < Luzon.length; i++) {
	        	int Luzon_countOnes = 0;
	        	
	        	for (int a = 0; a < Luzon[i].length; a++) {
	        		System.out.print(Luzon[i][a] + "	");
	        		
	        		if (Luzon[i][a] == 1) {
	        			Luzon_totalOnes++;
	        			Luzon_countOnes++;
	        			
	        		} else {
	        			Luzon_totalZeros++;
	        			
	        		}
	        	}
	        	if (Luzon_countOnes > Luzon_highestOnes) {
	        		Luzon_highestOnes = Luzon_countOnes; 
	        		Luzon_bestRow = i;
	        		
	        	}
	        	System.out.println();
	        }
	        
	        System.out.println("Total number of zeros: " + Luzon_totalZeros);
	        System.out.println("Total number of ones: " + Luzon_totalOnes);
	        System.out.println("Row with the highest number of ones: " + (Luzon_bestRow + 1));
	        System.out.println("Highest number of ones in a row: " + Luzon_highestOnes);
		
	}

}
