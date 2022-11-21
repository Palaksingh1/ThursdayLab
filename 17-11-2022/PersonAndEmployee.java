package oopsconcepts;
class Person1
{
	String name;

	public Person1(String name) 
	{
		this.name=name;
	}

	public String getName() 
	{
		return name;
	}
}
class Employeez extends Person1 
{
		double annualSalary;
		int yearOfStartWorking;
		String nationalInsuranceNo;
		
		public Employeez(String name, double annualSalary, int yearOfStartWorking, String nationalInsuranceNo) 
		{
			super(name);
			this.annualSalary = annualSalary;
			this.yearOfStartWorking =yearOfStartWorking;
			this.nationalInsuranceNo = nationalInsuranceNo;
		}

		public double getAnnualSalary() 
		{
			return annualSalary;
		}

		public int getyearOfStartWorking() 
		{
			return yearOfStartWorking;
		}

		public String getNationalInsuranceNo() 
		{
			return nationalInsuranceNo;
		}
		
		@Override
		public String getName() 
		{
			return name;
		}

		@Override
		public String toString() 
		{
			return "Employee\n[AnnualSalary=" + annualSalary + "\nYearOfStartWorking=" + yearOfStartWorking 
					+ "\nNationalInsuranceNo="+ nationalInsuranceNo + "\nName=" + name + "]";
		}	
}	

public class PersonAndEmployee {
public static void main(String[] args) 
{
	Employeez emp1 = new Employeez("Palak Singh", 5000000, 2022, "2021jkjk");
	System.out.println(emp1);
	
	System.out.println("_____________________________________");
	Employeez emp2 = new Employeez("Subhi", 6000000, 2022, "2021ubsl");
	System.out.println(emp2);
	
}	
}

