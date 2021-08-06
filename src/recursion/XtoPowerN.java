package recursion;

public class XtoPowerN {

	public static void main(String[] args) {
		
		System.out.println(power(2,10));

	}
  public static int power(int x,int n)
  {
	  if(n==0)
	  {
		  return 1;
	  }
	 
	  if(n%2==0)
	  {
		   int pow=power(x*x,n/2);
		   return pow;
	  }
	  else {
		 int pow=x*power(x,n-1);
		 return pow;
	  }
	  

  }
}
