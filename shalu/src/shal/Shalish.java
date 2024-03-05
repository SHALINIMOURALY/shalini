package shal;
import java.util.Scanner;


public class Shalish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asciistr;
		int i = 0;
			
		 Scanner sc= new Scanner(System.in);

		System.out.print("\n Please Enter any Sentence for ASCII Codes :  ");
		asciistr = sc.nextLine();
			
		while(i < asciistr.length())
		{
			System.out.println("The ASCII Value of " + asciistr.charAt(i) +
					" Character = " + asciistr.codePointAt(i));
			i++;
		}
	}
}
	
