import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	  
	  int Max=Integer.MIN_VALUE;
	  int j=sc.nextInt();
	  
	     for(int i=0;i<j;i++)
	     {
	    	 int n=sc.nextInt();
	    	 if(n>Max)
	    		 
	    	 {
	    		 Max=n;
	    	 }
	     }
	     System.out.println(Max);
	}

}
