package oopsconcepts;

interface LibraryUser
{
	//methods name
	public void registerAccount();
	public void requestBook();

}

class KidUser implements LibraryUser
{
	int age;
	String bookType;
	
	//Generate only setter method
	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setBookType(String bookType) 
	{
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount()
	{
		if(age<=12)
			System.out.println("You have successfully registered under a Kids Account");
		if(age>12)
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
			
	}
	
	@Override
	public void requestBook()
	{
		if(bookType.equalsIgnoreCase("Kids"))
			System.out.println("Book issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
			
	}

}


class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	
	//Generate only setter method
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setBookType(String bookType) 
	{
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount()
	{
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account");
		if(age<12)
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
			
	}
	
	@Override
	public void requestBook()
	{
		if(bookType.equalsIgnoreCase("Fiction"))
			System.out.println("Book issued successfully,please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only Adult Fiction books");		
	}
	
}

public class LibraryInterfaceDemo {
   public static void main(String []args)
   {
	//Test case #1
	KidUser kidUser=new KidUser();
	
	kidUser.setAge(10);  // set values
	kidUser.setBookType("Kids");
	kidUser.registerAccount();
	kidUser.requestBook();
	
	kidUser.setAge(18);  // set values
	kidUser.setBookType("Fiction");
	kidUser.registerAccount();
	kidUser.requestBook();
	
	System.out.println("--------------------------------------------------------");
	
	//Test case #2
	AdultUser adultUser=new AdultUser();
	
	adultUser.setAge(5);  // set values
	adultUser.setBookType("Kids");
	adultUser.registerAccount();
	adultUser.requestBook();
	
	adultUser.setAge(23);  // set values
	adultUser.setBookType("Fiction");
	adultUser.registerAccount();
	adultUser.requestBook();
	
    }
}
