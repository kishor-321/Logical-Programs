package learn;
class math {
	void math1 () {
		System.out.println("im maht1 parent class");
	}
}
class pallindrom extends math {
 void leap (int year) {
		if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} 
		else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
		
	}

}
class reverse extends math {
	void mutew () {
		System.out.println("non static mutew");
	}
}
class leapyear extends math {
	void muty () {
		System.out.println(" void muty");
	}
}
class inheritance {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		pallindrom kk = new pallindrom();
		kk.leap(1996);
		kk.math1();
		
	}
}
