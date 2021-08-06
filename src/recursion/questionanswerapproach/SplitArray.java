package recursion.questionanswerapproach;

public class SplitArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		printSplitArray(arr,0,0,0,"","");

	}
public static void printSplitArray(int arr[],int vidx,int sg1,int sg2,String g1,String g2)
{
	if(vidx==arr.length)
	{
		if(sg1==sg2)
		{
			System.out.println(g1+" & "+g2);
		}
		return;
	}
	printSplitArray(arr,vidx+1,sg1,sg2,g1,g2);
	printSplitArray(arr,vidx+1,sg1+arr[vidx],sg2,g1+" "+arr[vidx],g2);
	printSplitArray(arr,vidx+1,sg1,sg2+arr[vidx],g1,g2+" "+arr[vidx]);
	
}
}
