package questions;

import java.util.HashSet;

public class FindPairsInSorted {

	
	//all pairs in unsorted array using hashset
	public static void main(CustomString[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,1,2,3,2,3,4,9,3,4,4};
      int k=5;
      pairsUnsorted(arr,k);
      
	}
	public static void pairsUnsorted(int arr[],int k)
	{
		HashSet<Integer>set=new HashSet<>();
		for(int i:arr)
		{
			set.add(i);
		}
		for(int i:arr)
		{
			int num=k-i;
			if(set.contains(num))
			{
				System.out.println(i+" "+num);
			}
		}
	}
   public static void pairsEqualToK(int arr[],int k)
   {
	   int i=0,j=arr.length-1;
	   while(i<j)
	   {
		   if((arr[i]+arr[j])>k)
		   {
			   
			   j--;
		   }
		   else if(arr[i]+arr[j]<k)
		   {
			   i++;
		   }
		   else {
			   System.out.println(arr[i]+" "+arr[j]);
			   j--;
		   }
		   
		   
	   }
	   
	   
   }
}
