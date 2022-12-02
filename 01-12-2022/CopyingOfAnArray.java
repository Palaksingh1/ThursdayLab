package arrayexamples;

import java.util.Scanner;

public class CopyingOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,size; //Initializing variable
		System.out.println("Enter the size of the Array: ");
		size = sc.nextInt(); 
		
		int arr1[] = new int [size]; //initializing array 1
		int arr2[] = new int [size]; //initializing array 2
		
		System.out.println("Enter "+size+" elements to add into the Array:");
		
		for(i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt(); //Adding elements in Array 1
		}
		
		System.out.println("New Copied Array from previous one is follows:");
		
		for(i=0;i<size;i++)
		{
			arr2[i] = arr1[i];  //copying array 1 into array 2
			System.out.print(arr2[i]+" "); //output of copied array
		}
	}

}
