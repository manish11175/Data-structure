package algorithm;

import java.util.Arrays;

public class TripletWithZeroSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,-8,0};
		boolean ans=tripletSum(arr);
		System.out.println(ans);

	}
	public static boolean tripletSum(int arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(twoSum(arr,-arr[i],i+1))
			{
				return true;
			}
		}
		return false;
	}
	public static boolean twoSum(int arr[],int x,int i)
	{
		int j=arr.length-1;
	   while(i<j)
	   {
		   if(arr[i]+arr[j]>x)
		   {
			   j--;
		   }
		   else if(arr[i]+arr[j]<x)
		   {
			   i++;
		   }
		   else {
			   return true;
		   }
	   }
	   return false;
	
	}

}
