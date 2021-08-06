package questions;

public class FindUniqueNo {

	public static void main(CustomString[] args) { 
		int a[]= {1,2,3,3,4,5,4,5,1,2,19,12,2,2,12};
       System.out.println(uniqueNo(a));
	}
	
public static int uniqueNo(int arr[])
{
	int ans=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		ans^=arr[i];
	}
	return ans;
}

}
