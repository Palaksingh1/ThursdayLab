package basicprogram;

import java.util.Scanner;
public class LoopMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        
        for(i=1;i<=10;i++)
        {
        	System.out.println(n+" * "+i+" = "+n*i);
        	sc.close();
        }
	}

}
