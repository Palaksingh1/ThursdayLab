package multithreading;

class Creature
{
	void eat()
	{
		System.out.println("Creatures eat");
	}
}

class Herbivores extends Creature
{
	void eat()
	{
		System.out.println("Herbivores eat plants");
	}
}

class Omnivores extends Creature
{
	void eat()
	{
		System.out.println("Omnivores eat plants and meat");
	}
}

class Carnivores extends Creature
{
	void eat()
	{
		System.out.println("Carnivores eat meat");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creature C=new Creature();
		Creature h=new Herbivores();
		
		//upcasting
		Creature o=new Omnivores();
		//upcasting
		Creature c=new Carnivores();
		
		//upcasting
		C.eat();
		h.eat();
		o.eat();
		c.eat();
		
	}

}
