package oopsconcepts;
import java.util.Scanner;
public class CountOfOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String a;
		char b;
		int count = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string: ");
		a = sc.nextLine();
		
		System.out.println("Enter the alphabet to be searched:");
		b = sc.next().charAt(0);
		
		// To search for the alphabet
		for(i = 0;i<a.length();i++)
		
		if(a.charAt(i)==b)
		{
			count++; //To count and store the occurrence of the character
		}
        System.out.println("The total number of time "+b+" has occured is "+count);
			
	}

}
