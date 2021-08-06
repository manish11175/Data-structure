package questions;

public class FindTheMissingNumber {

	public static void main(CustomString[] args) {
		int arr[]= {3,3,5,6,2,1};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]-1]>0)
			{ 
				arr[arr[i]-1]*=-1;
				
			}
			else {
				System.out.println(i+1);
				break;
			}
		}

	}

}
