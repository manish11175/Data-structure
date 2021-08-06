package algorithm;
// largest sum in contiguous array 
public class KadaneAlgo {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,-90,-9,10,-5,-1};
		largestSum(arr);

	}
	public static void largestSum(int arr[])
	{  
		int max=Integer.MIN_VALUE;
		int currentSum=0;
		for(int i=0;i<arr.length;i++)
		{
			currentSum+=arr[i];
			if(currentSum>0)
			{
				max=Math.max(max, currentSum);
			}
			if(currentSum<0)
			{
				currentSum=0;
			}
		}
		System.out.println("the sum of largest subarray is "+ max);
	}

}
