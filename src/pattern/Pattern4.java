package pattern;

public class Pattern4 {
	

	public static void main(String[] args) {
		pattern4(4);
					
		}
	public static void pattern4(int n)
	{
		int row=1;
		int cols=1;
		int nst=1;
	
		while(row<=n)
		{
			cols=1;
			while(cols<=n-nst)
			{
			
				System.out.print("  ");
				cols++;
			
			}
			cols=1;
			while(cols<=nst)
			{
			
				System.out.print(" *"+"  ");
				cols++;
			
			}
			System.out.println();
			row++;
			nst++;
			
		}


	}

}
