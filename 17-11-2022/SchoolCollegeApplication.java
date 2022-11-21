package oopsconcepts;

class Person2
{
	 String name,dateOfBirth;
	 public Person2(String name,String dateOfBirth)
	 {
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	 }
	 public String getname()
	 {
		 return name;
	 }
	 public String getdateOfBirth()
	 {
		 return dateOfBirth;
	 }
}

class Teacher extends Person2
{
    int salary;
    String subject;
    public Teacher(String name,String dateOfBirth,int salary,String subject)
    {
    	super(name,dateOfBirth);
    	this.salary=salary;
    	this.subject=subject;
    }
    public int getsalary()
    {
    	return salary;
    }
	public String getSubject() 
	{
		return subject;
	}
}
class Student1 extends Person2
{
	int StudentId;
	public Student1(String name,String dateOfBirth,int StudentId)
	{
		super(name,dateOfBirth);
		this.StudentId=StudentId;
	}
	public int getStudentId() 
	{
		return StudentId;
	}
}
class CollegeStudent extends Student1
{
	String collegeName;
	String year;
	public CollegeStudent(String name,String dateOfBirth,int StudentId,String collegeName,String year)
	{
		super(name,dateOfBirth,StudentId);
		this.collegeName=collegeName;
		this.year=year;		
	}
	public String getCollegeName() 
	{
		return collegeName;
	}	
	public String getYear() 
	{
		return year;
	}	
}

public class SchoolCollegeApplication {
public static void main(String []args)
{
	System.out.println("College Application");
    System.out.println("===============================================");
    Teacher tea=new Teacher("Monalisa Chakraborty","27-12-1991",50000,"Java Full Stack");
    System.out.println("Teacher Name: "+tea.getname());
    System.out.println("Date of Birth: "+tea.getdateOfBirth());
    System.out.println("Salary: "+tea.getsalary());
    System.out.println("She Teaches us Subject: "+tea.getSubject());
    
    System.out.println("===============================================");
    Student1 std=new Student1("Palak","14-11-2002",121);  
    System.out.println("Student Name: "+std.getname());
    System.out.println("Date of Birth: "+std.getdateOfBirth());
    System.out.println("Student Id: "+std.getStudentId());
    
    System.out.println("===============================================");
    CollegeStudent colstd=new CollegeStudent("Palak","14-11-2002",121,"Anudip Foundation","Final");
    System.out.println("Student Name: "+colstd.getname());
    System.out.println("Date of Birth: "+colstd.getdateOfBirth());
    System.out.println("Student Id: "+colstd.getStudentId());
    System.out.println("College Name: "+colstd.getCollegeName());
    System.out.println("Year of Studying: "+colstd.getYear());

}
}

