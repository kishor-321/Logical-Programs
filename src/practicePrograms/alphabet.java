package practicePrograms;

public class alphabet {

	public static void main(String[] args) {


		char c1='a';
		while(c1<='z')
		{
			if (!((c1=='a') || (c1=='e') || (c1=='i') || (c1=='o') || (c1=='u'))) 
			{


			System.out.println("consonent letters");

			}else {	 System.out.println("vowels");
			
			}

			System.out.println(c1+"");
			c1++;
		
		}}}

