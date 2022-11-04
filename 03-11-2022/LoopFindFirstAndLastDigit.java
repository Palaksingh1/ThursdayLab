package basicprogram;

import java.util.Scanner;

public class LoopFindFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int FirstDigit=0,lastDigit=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        
        lastDigit= n%10;
        System.out.println("Last digit: "+lastDigit);
        
        while(n!=0)
        {
        	FirstDigit=n%10;
        	n=n/10;
        	sc.close();
        }
        System.out.println("First digit :"+FirstDigit);
	}

}
