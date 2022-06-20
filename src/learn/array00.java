package learn;

import java.util.Arrays;

public class array00 {
	static int [] returnsarr() {
		return new int[]  { 20,50,8,6,9};
	}
	public static void min (int arr[]) {
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("calling the min number from the array "+min);
	}
	public static void max (int arr[]) {
		int max =arr[0];
		for (int j=1; j < arr.length; j++) {
			if (max < arr[j]) {
				max=arr[j];
			}
		}
		System.out.println("max number in array is: "+max);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra= new int[3];
		System.out.println("Calling the 1st array ="+arra[0]);
		System.out.println("Calling the 2nd array ="+arra[1]);
		System.out.println("Calling the 3rd array ="+arra[2]);
		arra[0]=20;
		arra[1]=30;
		arra[2]=40;
		System.out.println("********after initialization***************");
		System.out.println("Calling the 4th array ="+arra[0]);
		System.out.println("Calling the 5th array ="+arra[1]);
		System.out.println("Calling the 5 th array ="+arra[2]);
		System.out.println("********Calling the total arrays*****");
		System.out.println("array elemnt count ="+arra.length); //length is the property of array
		System.out.println("For loop");
		for (int i=0; i<arra.length; i++) {
			System.out.println(arra[i]);
		}
		System.out.println("for each loop");
		for (int eachloop: arra) {
			System.out.println(eachloop);
		}
		char [] getarray = { 'A', 'B' , 'c', 'D'};
		for (char getarray1 : getarray) {
			System.out.println("Calling getarray 1=="+getarray1);
		}
		int [] asd = {10,20,30,40,50,60};
		System.out.println("Calling asd ="+asd[0]);
		System.out.println("Callign asd ="+asd[1]);
		System.out.println("Calling asd ="+asd [2]);
		System.out.println("Calling asd ="+asd[3]);
		System.out.println("Callign asd ="+asd[4]);
		System.out.println("Calling asd ="+asd [5]);
		System.out.println("********Calling for loop**********");
		for (int i =0; i<asd.length;i++) {
			System.out.println("calling asd no for loop ="+asd[i]);
		}
		for (int asd1 : asd ) {
			System.out.println("Calling asd roll call ="+asd1);
		}
		int [] asdd = {10,20,30,40,50,60};
		int sum=0;
		int avg;
		for (int asd2 : asdd) {
			sum=sum + asd2;
			System.out.println("Calling asd adition"+asd2);
			int arraylenghth=asdd.length;
			avg= sum/arraylenghth;
			System.out.println("calling the sum of asdd ="+sum);
			System.out.println("Calling the average ="+avg);
		}
		int arr[] = { 33, 13, 4, 50,15,1 };
		min(arr);
		max(arr);
		int arr23 []=array00.returnsarr();
		for (int e=0; e< arr23.length;e++) {
			System.out.println("calling returns ="+e);
			System.out.println(arr23[e]);
		}
		int[][] atw=new int[3][3];
		System.out.println("Array Size: " + atw.length);
		for (int p=0; p < atw.length; p++) {
			for (int u=0; u< atw.length; u++) {

				System.out.print(" "+atw[p][u]);
			}
			System.out.println();
		}	
		atw [0][0]=1;
		atw [0][1]=2;
		atw [0][2]=3;
		atw [1][0]=4;
		atw [1][1]=5;
		atw [1][2]=6;
		atw [2][0]=7;
		atw [2][1]=8;
		atw [2][2]=9;
		System.out.println("array size 3*3 ="+atw.length);
		for (int t= 0; t<atw.length;t++) {
			for (int y=0; y<atw.length; y++) {
				System.out.print(atw[t][y]+" ");
			}
			System.out.println();
		}
int [] we[] = {{4,5,6},{7,8,9},{10,11,12,13,14},{12,18,83,95,75}};
System.out.println("calling length"+we.length);
for (int r=0; r<we.length;r++) {
	for (int s=0; s< we[r].length;s++) {
		System.out.print(" "+we[r][s]);
	}
	System.out.println();
}
	char [] copyfromhere = {'a','c','f','y','r','e','t','c'};
	char [] copyto =new char[5];//printing char [5];
	
	
	System.arraycopy(copyfromhere, 2, copyto, 0, copyto.length); //from 0,1,2 i.e f upto 5 letters 
	
	
	
	
	for(int u=0; u<copyto.length;u++ ) {
		System.out.print(copyto[u]+",");
	}
	System.out.println("\n");
	int aqw [] = {58,85,96,78};
	System.out.println("CAllin length ="+aqw.length);
	System.out.println("CAlling with the original ");
	for (int q : aqw) {
		System.out.println(q);
	}
	System.out.println("Callin gwith clonning");
	int aqw1[] =aqw.clone();
	for(int w : aqw1) {
		System.out.println(w);
	}
	System.out.println("Comparing its value is true or not aqw and aqw1 ="+Arrays.equals(aqw,aqw1));
	
	System.out.println("Calling with copying");
	int aqw2[] =Arrays.copyOf(aqw1, aqw1.length);
	for (int t : aqw2 ) {
		System.out.println(t);	
		}
	System.out.println("Comparing its value is true or not aqw1 and aqw2 ="+Arrays.equals(aqw1,aqw2));
	
	System.out.println("copying with the editing h/much we required");
	int rds [] = Arrays.copyOfRange(aqw, 0, 3 );
	for (int g : rds) {
		System.out.println(g);
	}
	System.out.println("Comparing its value is true or not aqw2 and rds ="+Arrays.equals(aqw2,rds));
	
	System.out.println("calling wirh sorting way assemdimg");
	Arrays.sort(aqw);
	for (int p : aqw) {
		System.out.println(p);
	}
	
	}
}
