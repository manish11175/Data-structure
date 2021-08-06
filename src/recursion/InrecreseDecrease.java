package recursion;

public class InrecreseDecrease {

	public static void main(String[] args) {
        int n=6;
		printOdd(n);
	}

	
	public static void printOdd(int n)
	{   
		if(n==0) {
			return;
		}
		if(n%2!=0)
		{
			System.out.println("Hi"+n);
			printOdd(n-1);	
		}
		else {
			printOdd(n-1);
			System.out.println("bye"+n);
		}
		
	}
	
	
	
	
	
}
