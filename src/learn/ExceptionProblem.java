package learn;



public class ExceptionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("* Program Start *\n");
		int a= 10;
		int b = 0; 
		int div = 0; 
		try {
			System.out.println("Inside Try Block 1");
			div = a/b;
			System.out.println("Inside Try Block 2");
		}
		catch (Exception e) {
			System.out.println("Inside Catch Block 1");
			e.printStackTrace();
			System.out.println("Inside Catch Block 2");
		}
		System.out.println("Division = "+div);
	}
}
