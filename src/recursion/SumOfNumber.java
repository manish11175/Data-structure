package recursion;

public class SumOfNumber {

	public static void main(String[] args) {
		System.out.println(sumOfNumber(5));

	}
	
	public static int sumOfNumber(int n)
	{
		if(n==1)
		{
			return 1;
		}
		System.out.println(n);
	    return n+sumOfNumber(n-1);
	}
}
