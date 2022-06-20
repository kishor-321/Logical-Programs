package practicePrograms;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123, rev=0, rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;

		}
		System.out.println("reverse "+rev);
		System.out.println("call pallindrom "+pallindrom(12321));
	}
	static boolean pallindrom (int num ) {
		int rev=0, rem, temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		} if (temp==rev) {
			return true;
	} 
		return false;
}
}