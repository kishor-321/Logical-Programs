package learn;

//import exceptionHandeling.Exception;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;//
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (Throwable e) { 					
			System.out.println("Parent Exception occurs");
		}
		try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}



