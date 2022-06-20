package practicePrograms;

public class invertedpyramid  { 
	public static void main (String[] args)   { 

		char ch = '*' ; 

		for (int i = 1; i <= 15; i++){ 
			if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 ||i == 11 ) 

				System.out.print( ch ); 
			else
				System.out.print(" "); 
		} 
		// first line complete
		System.out.println( );

		for (int i = 1; i <= 10; i++){ 
			if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 ) 

				System.out.print( ch ); 
			else
				System.out.print(" ");
		}
		// second line
		System.out.println( );
		for (int i = 1; i <= 10; i++){ 
			if ( i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 ) 

				System.out.print( ch ); 
			else
				System.out.print(" ");
			// third line	 

		} System.out.println( );
		for (int i = 1; i <= 10; i++){ 
			if ( i == 4 || i == 5 || i == 6 || i == 7 || i == 8 ) 

				System.out.print( ch ); 
			else
				System.out.print(" ");
		}
		// fourth line

		System.out.println( );
		for (int i = 1; i <= 10; i++){ 
			if (  i == 5 || i == 6 || i == 7  ) 

				System.out.print( ch ); 
			else
				System.out.print(" ");
		} // fifthe line
		System.out.println( );
		for (int i = 1; i <= 10; i++){ 
			if (   i == 6  ) 

				System.out.print( ch ); 
			else
				System.out.print(" ");
			//six line
		}}}