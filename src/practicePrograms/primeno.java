package practicePrograms;

public class primeno {

	public static void main(String[] args) {
		checkPrimeNumber(83);
	}
static void checkPrimeNumber(int num) {

		int check=0;
		if(num==0||num==1) {
			System.out.println(num+" is not a prime number");
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num+" is not a prime number");
					check =1;
					break;
				}
			}
			if(check==0) {
				System.out.println(num+" is a prime number");
			}
		}
	}
}