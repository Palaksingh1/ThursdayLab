package oopsconcepts;

class Animal{
	 public void eat()
	 {
	  System.out.println(" eat");
	 }
	 public void sleep()
	 {
	  System.out.println("sleep ");
	 }
	}

	class Bird extends Animal{
	 @Override
	 public void eat() {
	  super.eat();
	  System.out.println(" overide eat");
	 }
	 @Override
	 public void sleep() {
	  super.sleep();
	  System.out.println("overide sleep");
	 }
	 public void fly()
	 {
	  System.out.println(" fly");
	 }
	}

	 public class AnimalInheritance{
	  public static void main(String[]args) 
	  {
	  Animal ani= new Animal();
	  ani.eat();
	  ani.sleep();
	  
	  Bird bir= new Bird();
	  bir.eat();
	  bir.sleep();
	  bir.fly();
	  
	 }
		
	}


