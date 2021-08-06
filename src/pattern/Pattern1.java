package pattern;

public class Pattern1 {
	

	public static void main(String[] args) {
		pattern1(4);
					
		}
	public static void pattern1(int n)
	{
		int row=1;
		int cols=1;
		int nst=1;
		while(row<=n)
		{
			cols=1;
			while(cols<=nst)
			{
				System.out.print(cols+" ");
				cols++;
			}
			System.out.println();
			row++;
			nst++;
			
		}


	}

}
