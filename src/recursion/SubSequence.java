package recursion;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 50, 5, 5 };
		getSSTarget(arr, 0, 60, "");
	}

	public static void getSSTarget(int arr[],int vidx,int target,String asf)
   {
	   if(vidx==arr.length)
	   {
		   if(target==0)
		   {
			   System.out.println(asf);
		   }
		   return;
	   }
	   getSSTarget(arr,vidx+1,target-arr[vidx],asf+"\t"+arr[vidx]);
	   getSSTarget(arr,vidx+1,target,asf);
	   
   }


}
