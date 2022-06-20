package learn;

import learn.interfa.interfacingClass;

class math1 {
	static double  a = (int)25; //double > int explicit narrowing
	long mob =8875441;
//	long mob =(double) 8875441; long chi value double madhe long <double widening
	private long pin=2345;
	private long ope=1350;

	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public long getOpe () {
		return ope;
	}
	public void setope (long ope) {
		this.ope=ope;
	}

	void math1 ( ) {
		System.out.println("Im maht1 parent class");
	}

}

class leapyear1 extends math1 {
	void lacta() {
		System.out.println("i m in leapyear lacta method");
	}
	void leap (int year) {
		if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		} 
		else {
			System.out.println("Common year or non Leap year");
		}	
	}
}
class reverse1 extends leapyear1 {
	reverse1(){
		this(10);
		System.out.println("im constructor of reverse 1");
	}
	reverse1(int a){
		this(10,20.50);
		System.out.println("iam constructor of reverse 2");
	}
	reverse1 (int a , double b) {
		System.out.println("Im constructor of reverse 3");
	}
	void lacta(int c) {
		super.lacta();
		System.out.println("i m in reverse lacta method");
	}
	double reversing (int num) {
		System.out.println("non static reversing");
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("call reverse number ="+rev);
		return rev;
	}

}
class pallindrom1 extends reverse1 {
	void lacta() {
		super.lacta(10);
		System.out.println("i m in pallindrom1 lacta method");

	}
	static void lacta (double x) {

		System.out.println("Ovarload me im from pallindrom method 2");

	}
	static void lacta (double x, double y) {
		System.out.println("Overload me im from pallindrome method 3");

	}
	static	void lacta (double x, double y, char a) {
		System.out.println("oveload me im from pallindrom method 4");

	}
	boolean pallindrom (int num ) {
		int rev=0, rem, temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		} if (temp==rev) {

			System.out.println("return true "+temp);
			return true;
		} 
		System.out.println("return false "+temp);
		return false;
	}
}
abstract class abs1 {
	static int d=35;
	int s=25;
	static void print() {
		System.out.println("im abstaract static method");
	}
	abs1() {
		System.out.println("im constructor of abstract class");
	}
	void abs1method () {
		this.abs1metho(10);
		System.out.println("im abstract in method1");
	}
	void abs1metho (int v) {
		System.out.println("Im abstarct in method 2");
	}
	public abstract void meto () ;
	// abstarct method doesnt have the body need to override for contract
}
class abs2 extends abs1 {
	@Override
	void abs1method () {
		super.abs1method();
		System.out.println("im abstaract metho3");
	}
	@Override
	void abs1metho (int v) {
		super.abs1metho(10);
		System.out.println("im abstarct method 4");
	}
	public void meto() {
		System.out.println("im from abtract clas method 5");

	}

}

interface printing {
	int p=255; 								//public static final int p =255 ;  = its by default public means its visibility is everywhere 
	//	 static means its easy to access final means its cant be change that is constant
	public void intnaf ();				 //by default due to interface = public abstract void intnaf ();
	// here don't have an body because its by default abstract
	public void redxon (); 					//default and static can not use together and while write the default method need to write default in case having interface
}
interface printing2 {
	void intanaf2 ();
	void intnaf ();
}
class interfa implements  printing, printing2  {
	int l=41;
	public void intnaf () {
		System.out.println("iam class from interfa method");
	}
	public void intanaf2() {
		System.out.println("Im method from interfa class");
	}

 class interfacingClass extends interfa  { //implements printing2, printing
		public void intnaf () {
			System.out.println("Im class interface ");		
		}
		public void intanaf2 () {
			System.out.println("Im class interface 2 method");
		}
 }
		public static int rest (int b) {
			return b;

		}
		public interface serializable{
			//empty body i.e. marker ot tagged interface such as serializable, cloanable, remote....
		}
	

	@Override
	public void redxon() {
		// TODO Auto-generated method stub
		System.out.println("Im red Zone");	

	}
}
class upcasting {
	public void kutra () {
		System.out.println("Im from upcasting method 1");
	}

	
}
	class upcasting1 extends upcasting {
		public void doggy() {
			// TODO Auto-generated method stub
			System.out.println("Im from upcasting method2");
		}
 
	}
		class upcasting2 extends upcasting1 {
		public	void monty () {
				System.out.println("I m from upcasting 2 method 3");
			}
	}

public class apjd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Im calling static variable ="+math1.a);
		int a =35;
		System.out.println("calling the updated non static variable ="+a);
		
		pallindrom1 kk = new pallindrom1();
		System.out.println("Calling non static variable ="+kk.mob);
		kk.lacta();
		kk.leap(2000);
		kk.reversing(123);
		kk.pallindrom(16461);
		kk.lacta(20.5);
		kk.lacta(20.2,20.5);
		kk.lacta(12.3, 3.2, 'a');
		
		abs2 hj1 =new abs2();
		hj1.print();
		System.out.println("Im static method from abstarct class ="+abs1.d);
		System.out.println("Im non-static method from abstarct class ="+hj1.s );
		hj1.abs1method();
		hj1.meto();
		
		System.out.println("IM FRom Interface variable "+printing.p);
		
		interfa ce1=new interfa();
		System.out.println("Im from class out from interace "+ce1.l);
		ce1.intnaf();
		ce1.intanaf2();
		
//		interfacingClass ci=new interfacingClass(); //could not call with implicit upcasting
//		interfacingClass ce2=(interfacingClass)ce1;
		interfacingClass ce21=ce1.new interfacingClass();
//		interfacingClass ce3= ce2;
		ce21.redxon();

		System.out.println("Calling statc ffrom interface ="+interfacingClass.rest(25));
		
		math1 po=new math1();
		System.out.println("Im calling the pin which is set private now read only =" +po.getPin());
		po.setPin(20);
		System.out.println("calling updated encapsulation setter method ="+po.getPin());

		System.out.println("calling the getmethod encapsulation gtter read only =" +po.getOpe());
		po.setope(465826);
		System.out.println("calling updated in setter ope = "+po.getOpe());
	
	
		upcasting dog1 =new upcasting (); //upcasting
		dog1.kutra();
		
		upcasting1 dog2 = new upcasting2(); //upcasting
		dog2.kutra();
		dog2.doggy();
//		dog2.monty (); 
		
		//different type of explicit upcasting
		upcasting2 fg =new upcasting2(); //no casting
		fg.kutra(); 
		fg.doggy();
		fg.monty ();
		
		upcasting2 hj=fg; //explicit downcasting
		hj.kutra(); 
		hj.doggy();
		hj.monty ();

		upcasting2 hh=(upcasting2)fg; //explicit downcasting
		hh.kutra(); 
		hh.doggy();
		hh.monty ();
		
		upcasting2 ff=(upcasting2) new upcasting1(); //explicit upcasting
		ff.kutra(); 
		ff.doggy();
		ff.monty();
	}
}
