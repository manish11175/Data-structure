package algorithm;

import java.util.Arrays;

//Find the two number whose sum is equal to x
public class TwoPointerAlgo {
	public static void main(String[] args) {
      int arr[]= {1,2,4,-1,-4,5,6,-1,7,8,-2};
      Arrays.sort(arr);
      sumOfTwoNumber(arr,5);
	}
	

public static	void sumOfTwoNumber(int arr[],int x)
	{
		int i=0,j=arr.length-1;
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
				System.out.println(arr[i]+" "+arr[j]);
				i++;
				j--;
			}
		}
	}
	
	

}
