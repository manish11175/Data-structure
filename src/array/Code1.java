package array;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int t=sc.nextInt();
		  for(int i=0;i<t;i++)
		  {
		   int n=sc.nextInt();
		   int k=sc.nextInt();
		   int arr[]=new int[n];
		   int sum=0;
		   for(int j=0;j<arr.length;j++)
		   {
		       arr[j]=sc.nextInt();
		       sum+=arr[j];
		   }
		   System.out.println(sum*k);
		  }
	}

}
