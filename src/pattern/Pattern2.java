package pattern;

public class Pattern2 {
	

	public static void main(String[] args) {
		pattern3(4);
					
		}
	public static void pattern3(int n)
	{
		int row=1;
		int cols=1;
		int nst=1;
		int x=0;
		while(row<=n)
		{
			cols=1;
			while(cols<=nst)
			{
				x++;
				System.out.print(x+" ");
				cols++;
			
			}
			System.out.println();
			row++;
			nst++;
			
		}


	}

}
