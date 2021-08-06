package questions;

public class LargestSumOfArray {

	public static void main(CustomString[] args) {
        int arr[]= {1,-2,3,5,-4,8};
        
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<arr.length;i++)
        { current+=arr[i];
        	if(current>=0)
        	{  
        		max=Math.max(max,current);
        	}
        	if(current<0)
        	{
        		current=0;
        	}
        }

//this takes O(n^2)
//for(int i=0;i<arr.length;i++)
//        {  int sum=0;
//        	for(int j=i;j<arr.length;j++)
//        	{
//        		sum+=arr[j];
//        		max=Math.max(max, sum);
//        	}
//        }
        System.out.println(max);
	}

}
