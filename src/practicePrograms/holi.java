package practicePrograms;

public class holi  { 
	public static void main (String[] args)   { 

		char ch = '#'; 

		for (int i = 1; i <= 27; i++){ 
			if (i == 4 || i == 7 || i == 9 || i == 10 || i == 11 || i == 12 || i == 14 || i == 15 || i == 16 || i == 17 || i == 19 || i == 20 || i == 21 || i == 22 || i == 24 || i == 27) 

				System.out.print(ch); 
			else
				System.out.print(" "); 
		} 

		System.out.println(); 
		for (int i = 1; i <= 27; i++) { 
			if (i == 4 || i == 7 || i == 9 || i == 12 || i == 14 || i == 17 || i == 19 || i == 22 || i == 24 ||  i == 27) 
				System.out.print(ch); 
			else System.out.print(" "); 
		} 

		System.out.println(); 
		for (int i = 1; i <= 27; i++) { 
			if (i == 4 || i == 5 || i == 6 ||  i == 7 || i == 9 || i == 10 ||   i == 11 || i == 12 || i == 14 ||   i == 15 || i == 16 || i == 17 ||   i == 19 || i == 20 || i == 21 ||  i == 22 || i == 24 || i == 25 || i == 26|| i == 27)             System.out.print(ch); 
			else System.out.print(" "); 
		}

		System.out.println(); 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 7 || i == 9 ||   i == 12 || i == 14 || i == 19 ||   i == 25 || i == 26)             
				System.out.print(ch); 
			else System.out.print(" "); 
		} 

		System.out.println(); 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 7 || i == 9 || i == 12 ||  i == 14 || i == 19 || i == 25 || i == 26) 
				System.out.print(ch); 
			else System.out.print(" "); 
		} 

		System.out.println(); 
		System.out.println();  
		System.out.println(); 
		// Print first row 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 7 || i == 10 || i == 11 ||   i == 14 || i == 19 || i == 20 || i == 21 ||   i == 22)        
				System.out.print(ch);  
			else        
				System.out.print(" "); 
		} 
		// Print second row 
		System.out.println(); 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 7 || i == 9 || i == 12 || 
					i == 14 || i == 20 || i == 21)
				System.out.print(ch);
			else         System.out.print(" "); 
		}
		// Print third row 
		System.out.println(); 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 5 || i == 6 || i == 7 || i == 9 || i == 12 || i == 14 || i == 20 ||  i == 21)           
				System.out.print(ch); 
			else
				System.out.print(" "); 
		} 
		// Print fourth row 
		System.out.println(); 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 7 || i == 9 || i == 12 ||   i == 14 || i == 20 || i == 21)                
				System.out.print(ch); 
			else
				System.out.print(" "); 
		} 

		// Print fifth row 
		System.out.println(); 
		for (int i = 1; i <= 34; i++) { 
			if (i == 4 || i == 7 || i == 10 || i == 11 ||  i == 14 || i == 15 || i == 16 || i == 17 ||  i == 19 || i == 20 || i == 21 || i == 22)            
				System.out.print(ch); 
			else          
				System.out.print (" "); 
		}
	} 
}