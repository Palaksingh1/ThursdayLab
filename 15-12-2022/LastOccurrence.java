package oopsconcepts;

public class LastOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="hello world";    //this is a string
	     int strLastIndex =0;
	     int strFirstIndex=0;
	     System.out.println("string is:  "+str);
	     strLastIndex = str.lastIndexOf('o');  //we have to find the last occurrence of the letter 'o'
	     strFirstIndex=str.indexOf('o');
	     System.out.println("The last index of o in this String is:  "+strLastIndex);
	     System.out.println("The first index of o in this String is:  "+strFirstIndex);
	}

}
