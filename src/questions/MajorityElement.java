package questions;
//Moore Voting Algorithm
public class MajorityElement {

	public static void main(CustomString[] args) {

		int arr[]= {2,2,1,7,2,2};
		majorCandidate(arr);
		
		// TODO Auto-generated method stub

	}
	
	public static void majorCandidate(int arr[])
	{
		int count=1;
		int major=0;
		for(int i=1;i<arr.length;i++)
		{
		  if(arr[i]==arr[major])
		  {
			  count++;
		  }
		  else if(count>0)
		  {
			  count--;
		  }
		  System.out.println(count+" "+major);
		  if(count==0 && arr[i]!=arr[major])
		  { 
			  major=i;
			  
		  }
		  
		}
		
		if(count>0)
		{
			System.out.println(arr[major]);	
		}
		else {
			System.out.println("no major element is exits");
		}
			  
	}

}
