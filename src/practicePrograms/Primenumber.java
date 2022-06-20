package practicePrograms;

public class Primenumber {

	public static void main(String[] args) {
		int num= 3;
		int check =0;
		if (num==0 || num==1 ) {
			System.out.println("no prime no " +num);
		}		else {
			for (int i = 2; i<= num/2; i++) {
				if(num%i==0) {
					System.out.println("no prime no "+num);
					check=1;
					break;
				}
			}
			if(check==0) {
				System.out.println("its prime no ="+num);
			}
		}
	}


}
