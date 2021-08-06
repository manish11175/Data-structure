package oops.polymorphism;

public class MainClass {
	public static void main(String[] args)
	{
//		
//		Dog tommy=new Dog();
//		Pet p=tommy;
//		
//		tommy.walk();
//		p.walk();
//		tommy.barking();
//		
	greeting();	
	greeting("manish");
	greeting("manish",8);
		
	}
	public static void greeting()
	{
		System.out.println("Hi there");
	}
	public static void greeting(String name)
	{
		System.out.println(name+" Good Morning");
	}
	public static void greeting(String name,int count)
	{   
		while(count>0)
		{
			System.out.println(name+" Namaste Sir");
            count--;
		}
	}

}
