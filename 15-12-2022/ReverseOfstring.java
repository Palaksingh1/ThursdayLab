package oopsconcepts;

public class ReverseOfstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Technology is a boon";  //Technology is a boon is the string

		System.out.println("The original string is:" +str);
		StringBuilder reverseString = new StringBuilder(str);
		reverseString.reverse();

		String result = reverseString.toString();
		System.out.println("The Reverse String is:" +result);
	}

}
