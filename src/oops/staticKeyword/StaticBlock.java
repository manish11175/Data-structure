package oops.staticKeyword;

public class StaticBlock {
	
	
	
	static {
		System.out.println("this is block 1");
	}
	static {
		System.out.println("This is block 2");
		
	}

	public static void main(String[] args) {
		
     System.out.println("this is main");
	  	  
	}
	static{
		  System.out.println("This is block 3");
	      }

}
