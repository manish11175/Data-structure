package recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(100));

	}
   public static int factorial(int n)
   {
	   if(n==0)
	   {
		   return 1;
		   
	   }
	   int fac=factorial(n-1);
	   int fn=fac*n;
	   return fn;
   }
   
}
