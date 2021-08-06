package pattern;

public class PascalTriangle {

	PascalTriangle(int n)
	{
	 for(int i=0;i<n;i++)
	 {   int number=1;
		 for(int j=0;j<n-i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=0;j<=i;j++)
		 {
			 System.out.print(number+" ");
			 number=number*(i-j)/(j+1);
		 }
		 System.out.println();
	 }
	 
	 
	}
	public static void main(String[] args) {	
		
         PascalTriangle p=new PascalTriangle(5);
	}
   
}
