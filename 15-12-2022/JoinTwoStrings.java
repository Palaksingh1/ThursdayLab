package oopsconcepts;
import java.util.Scanner;
public class JoinTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		String str2;
		String str3;
		Scanner sc = new Scanner (System.in);
		
		//Taking string 1 input 
		System.out.println("Enter string 1: ");
		str1 = sc.nextLine();
		
		//Taking string 2 input
		System.out.println("Enter string 2: ");
		str2 = sc.nextLine();
		
		//joining and storing string 1 and string 2
		str3 = str1.concat(str2);
		
		System.out.println("Resultant string is : "+str3);
	}

}
