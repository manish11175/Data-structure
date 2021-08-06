package oops;

class Vehicle{
	int wheels;
	String color;
	Vehicle()
	{
		this.wheels=3;
	}
	Vehicle(int wheels)
	{
		this.wheels=wheels;
	}
	Vehicle(int wheels,String color)
	{
		this.color=color;
		this.wheels=wheels;
	}
}

public class MyConstructor {
     
//        MyConstructor()
//        {
//        	System.out.print("object is created ");
//        }
	
	public static void main(String[] args) {
		Vehicle eRikshaw=new Vehicle();
      Vehicle car=new Vehicle(4);
       Vehicle scooty=new Vehicle(2,"Pink");
       System.out.print("eRikshaw  wheels is "+eRikshaw.wheels);
      //System.out.print(scooty.wheels+" Wheels and color is "+scooty.color);
	}

}
