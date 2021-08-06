package arraypractice;

public class SubArraySum {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,4,2,5,5,7,3,7,3,0,7,1,1,1,1,1,5};
		int sum=10;
		printSumOfSubarray(arr,sum);
		}
//time complexity O(n^2)+n
	//Space complexity O(1)
	public static void printSum(int arr[],int sum)
	{
		int n=arr.length;
		int current_sum=0;
		for(int i=0;i<n;i++)
		{
			current_sum=arr[i];
			for(int j=i+1;j<=n;j++)
			{
				int p=j-1;
				if(current_sum==sum)
				{
					//System.out.println(i+" "+p);
					for(int k=i;k<=p;k++)
					{
						System.out.print(arr[k]+" ");
					}
					System.out.println();
					current_sum=arr[i];
					break;
			    }
				if(current_sum>sum||j==n)
				{
					break;
				}
				current_sum+=arr[j];
				
			}
			
		}
		
	}
	public static void printSumOfSubarray(int arr[],int sum)
	{
		int n=arr.length;
		int current_sum=arr[0],start=0;
		for(int i=1;i<=n;n++)
		{
			System.out.println(current_sum);               
			while(current_sum>sum && start<i-1)
			{
				current_sum-=arr[start];           
				start++;
			}
			if(current_sum==sum)
			{
				System.out.println(i+" "+(i-1));
				
			}
			
			if(i<n)
			{
				current_sum+=arr[i];
			}
			
		}
		
	}
}
