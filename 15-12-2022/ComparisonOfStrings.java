package oopsconcepts;
import java.util.Scanner;
public class ComparisonOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		String str2;
	
		Scanner sc = new Scanner (System.in);
		
		//taking String 1 from user
		System.out.println("Enter String 1 : ");
		str1 = sc.nextLine();
		
		//taking String 2 from user
		System.out.println("Enter String 2 : ");
		str2 = sc.nextLine();
		
		//comparing String 1 and String 2
		System.out.println("String1 and String2 are equal: "+str1.equalsIgnoreCase(str2));
			
	}

}
