package learn;

import java.util.Arrays;

class object {
	int q=25;
//	public int hashCode () {
//		return 125;
//	}
//	public String toString() {
//		return "heloo object 1";
//		// will not display due to not happen inheritance & override also not done
//}
	public boolean equals(object gt) {
		object gh=gt; //explicit upcasting
		return (this.q==gh.q); //25=25
	}
}
class object1 extends Object {
	void ret () {
		System.out.println("Im from object1 method");
	}
	
}
class object2 extends object1 {
	void ret2 () {
		System.out.println("im from object2 method ");
	}
	
}
class object3 extends object2{
	void ret3 () {
		System.out.println("im from ret3");
	}
	@override
	void ret2 () {
		System.out.println("Im from ret 2 overrided");
	}
//	public String toString() {
//		return "heloo Tostring im in inheritance tostring method";
//		// that will be display due to inheritance
//	}
}
	class object4 {
	object4() 
	{
		System.out.println("Im constructor of obj 4");
	}
//		public int  hashCode () {
//			return 909;
//		}
	}

public class arrayAssignment {

	public static void main(String[] args) {
		object hy =new object ();
		object th =new object () ;
		object fg =th;
		object df = fg=new object();
		fg.equals(new object());
		//above ways for creating the object of in upcasting
		System.out.println("comparing boolean object comparision ="+hy.equals(th));
		object3 ef =new object3 ();
		object3 yh = ef ;
		System.out.println("CAlling the Object "+ef);
		System.out.println("CAlling the object tostring ="+ef.toString());
		System.out.println("Calling the Object hashcode ="+ef.hashCode());
		object1 sd = new object1() ;
		System.out.println("calling object of object 1 class ="+sd);
		System.out.println("Calling objeect 1 tostring object ="+sd.toString());
		System.out.println("Caling object 1 hashcode of object1 ="+sd.hashCode());
		object2 sdf =new object2 () ;
		System.out.println("Im calling the sdf object of object 2 class ="+sdf);
		System.out.println("CAlling the sdf object with sdf.tostring ="+sdf.toString());
		System.out.println("Im calling the sdf object hex to decimal address ="+sdf.hashCode());
		object2 de = new object3 ();
		System.out.println("Im calling the object3 with ref obj2 ="+de);
		System.out.println("Calling the Object 3 with the tostring method ="+de.toString());
		System.out.println("Calling the object3 with the hasCode method ="+de.hashCode());
		object4 df1 =new object4 () ;
		System.out.println("CAlling the object of obhect 4 class ="+df1);
		System.out.println("Calling the object of object wth tostring ="+df1.toString());
		System.out.println("Calling the hashcode but return type need different ="+df1.hashCode());
		System.out.println("comapring objects ef and df ="+ef.equals(df1));
		System.out.println("Comparing Object sd and sdf ="+sd.equals(sdf));
		System.out.println("Comparing Objects de and def ="+de.equals(df1));
		object4 dfh = df1; //with explicity maximum time occure the true result
		System.out.println("Comparing objects of dfh and df ="+dfh.equals(df1));
		
		
		
		// TODO Auto-generated method stub
		int array1 [] = {20,50,77,80,90,85};  
		System.out.println("want first array"+array1.length);
		for (int p : array1) {
			System.out.println(p);
		}
		int[] array2 = Arrays.copyOf(array1, array1.length);
		System.out.println("want copies arrays ");
		for (int h : array2) {
			System.out.println(h);
		}
		int []art = new int [] {2,2,1,2,2,5,5,5,4,4};
		int[] visart =new int[art.length];
		int visart1 =-1;

		for (int d =0; d<art.length;d++) {
			int counter=1;

			for (int f = d+1; f<art.length; f++) {
				if (art[d]==art[f]){
					counter++;
					visart[f]=visart1;
				}
			}
			if (visart[d]!=visart1){
				visart[d]=counter;
			}
		}
		for (int d =0;d<art.length;d++ ) {
			if(visart[d]!=visart1) {
				System.out.println(art[d]+"frequancy of arr= "+visart[d]);
			}
		}

		int [] g = {2,3,4,5,6,7,8,9};
		System.out.println("array g is ");
		for (int i = 0; i<g.length;i++){
			System.out.println(g[i]);
		}
		int first = g[0];

		for (int k=0 ; k<g.length-1; k++) {
			g[k]=g[k+1];
		}
		g[g.length-1]=first;
		System.out.println("left output of array ");
		for (int i = 0; i<g.length;i++){
			System.out.println(g[i]);
		}
	}}
