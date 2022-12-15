package oopsconcepts;

public class LetterPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MUMBAI";int i;  //MUMBAI is the given Word
		boolean ch=false;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')   //I is the letter present or not
			{
				ch=true;
				
				break;
				
			}
		}
		System.out.println(ch);
		
		String str1="Ilove my India";
		int j;
		boolean ch1=false;
		for(j=0;j<str1.length();j++)
		{
			if(str1.charAt(j)=='I')
			{
				ch1=true;
				
				break;
			}
		}
		System.out.println(ch1);
		}
	
}


