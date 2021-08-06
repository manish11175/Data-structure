/* package codechef; // don't place package name! */
package array;
import java.util.*;


class CodeChef
{
	 public static int kConcatenationMaxSum(int[] arr, int k) {
	      int n=arr.length;
	      int brr[]=new int[k*n];
		  for(int i=0;i<brr.length;i++)
		   {
		    brr[i]=arr[i%n];
		   }
		  for(int r:brr)
		  {
			  System.out.println(r);
		  }
		  
	        int max=0;
		    int current_sum=0;
		    for(int i=0;i<brr.length;i++)
		    {
		        current_sum+=brr[i];
		        if(current_sum>0)
		        {
		        max=Math.max(max,current_sum);    
		        }
		            
		        if(current_sum<=0)
		        {
		            current_sum=0;
		        }
		        
		    }
		    return max;
	    }
	public static void main (String[] args) 
	{
		int arr[]= {1,-1};
		int k=1;
		System.out.println(kConcatenationMaxSum(arr,k));
//	{
//	     Scanner sc=new Scanner(System.in);
//	  int t=sc.nextInt();
//	  for(int l=0;l<t;l++)
//	  {
//	   int n=sc.nextInt();
//	   int k=sc.nextInt();
//	   int arr[]=new int[n];
//	   int brr[]=new int[k*n];
//	   for(int j=0;j<arr.length;j++)
//	   {
//	       arr[j]=sc.nextInt();
//	   }
//	   System.out.println(brr.length);
//	   for(int i=0;i<brr.length;i++)
//	   {
//	    brr[i]=arr[i%n];
//	    
//	   }
//	  for(int r:brr)
//	  {
//		  System.out.println(r);
//	  }
//	  largestSum(brr);
//	      
//	  }
	 
	}
	public static void largestSum(int brr[])
	{
	    int max=0;
	    int current_sum=brr[0];
	    for(int i=1;i<brr.length;i++)
	    {
	        current_sum+=brr[i];
	        if(current_sum>0)
	        {
	        max=Math.max(max,current_sum);    
	        }
	            
	        if(current_sum<=0)
	        {
	            current_sum=0;
	        }
	        
	    }
	    System.out.println(max);
	}

}
