package practicePrograms;

public class switchcalculator {

	public static void main(String[] args) {
		double num1 = 2, num2 = 5, res;

		char op = '*';

		switch (op) {

		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			break; 
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println("num1*num2=" + res);
			break;
			
		default:
			System.out.println("Unknown operation");
			break;
		}
	}

}
