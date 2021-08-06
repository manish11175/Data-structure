package recursion;

public class NFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(nthFibo(4));
	}
	public static int nthFibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
	int nfn1=nthFibo(n-1);
	int nfn2=nthFibo(n-2);
	int nfnth=nfn1+nfn2;
	
	return nfnth;
	
	}

}
