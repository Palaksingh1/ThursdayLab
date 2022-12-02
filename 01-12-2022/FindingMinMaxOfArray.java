package arrayexamples;

import java.util.Scanner;

public class FindingMinMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int size,max,min,i;  //initializing variables
	    //taking size of array
	    System.out.println("Enter the size of array:");
	    size=sc.nextInt();
	    
	    int arr[]=new int[size];    // Initializing array
	 	System.out.println("Enter "+size+" element in an array:");
	 	
	 	for(i=0;i<size;i++)
		{	
	    	arr[i]=sc.nextInt();   //Adding elements in Array
	    }
	 	// initialize minimum and maximum element with the first element
	 	max=min=arr[0];
	    
	    for(i=1;i<size;i++) 
	    {
	    	// if the current element is greater than the maximum found so far
	        if(arr[i]>max)
	            max=arr[i];
	        // if the current element is smaller than the minimum found so far
	        else if(arr[i]<min)
	            min=arr[i];
	    }
	    System.out.println("largest Number:" +max);
	    System.out.println("smallest Number:" +min);
	}

}
