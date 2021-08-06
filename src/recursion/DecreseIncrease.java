package recursion;

public class DecreseIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		increase(10);
		decrease(10);
		}

	public static void decrease(int n) {
		if (n == 0) {
			return ;
		}
		System.out.print(n + " ");
		decrease(n - 1);
	}

	public static void increase(int n) {
			if(n==0)
			{
				return ;
			}
			
			increase(n-1);
			System.out.print(n+" ");
	}
}
