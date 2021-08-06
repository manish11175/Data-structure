package recursion;

public class PtoPowerN {
   static int count=0;
	public static void main(String[] args) {
		int a=2,b=10;
		System.out.println(FastPower(2,10));
  
	}
public static int power(int a,int b)
{
	if(b==0)
	{
		return 1;
	}
	return a*power(a,b-1);
}
public static int Fastpower(int a,int b)
{
	count++;
	if(b==0)
	{
		return 1;
	}
	if(b%2==0)
	{
		return Fastpower(a*a,b/2);
	}
	else {
	  return a*Fastpower(a,b-1);	
	}
}


public static int FastPower(int n,int m)
{
	if(m==0)
	{
		return 1;
	}
	if(m%2==0)
	{
		return FastPower(n*n,m/2);
	}
	else {
		return n*FastPower(n,m-1);
	}
}


}
