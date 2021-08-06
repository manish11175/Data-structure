package recursion;

public class HiBye {

	public static void main(String[] args) {
		hiBye(5);

	}
	public static void hiBye(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2!=0)
		{
		
		 System.out.println("Bye"+n);
		}
		hiBye(n-1);
		
	  if(n%2==0){
			System.out.println("Hi"+n);
			
		}
	}

}
