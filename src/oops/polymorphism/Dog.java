package oops.polymorphism;

public class Dog extends Pet{
	String name="Tom";
	
	public void walk()
	{
		System.out.println("Dog is walking");
	}
	public void barking()
	{
		System.out.println(name+" Dog is Barking");
	}

}
