package practicePrograms;

public class Ifprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * num==2, num%num=0,num!=0,num!=1
		 */
		int num=20;
		if(!(num==0 || num==1) ){
			System.out.println("not a prime number : "+num);
		}else if((num%num==0 )) {
			System.out.println("Number is prime: "+num);
		}else {
			System.out.println();
		}
	}
}
//Incomplete program