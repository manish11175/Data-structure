package recursion.questionanswerapproach;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,50,40};
		targetSum(arr,0,60,"");

	}
public static void targetSum(int arr[],int vidx,int target,String asf)
{
   if(vidx==arr.length)
   {
	if(target==0)
	{
		System.out.println(asf);
	}
	return;
	}
   targetSum(arr,vidx+1,target-arr[vidx],asf+"\t"+arr[vidx]);
   targetSum(arr,vidx+1,target,asf);
}

}
