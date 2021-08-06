package recursion;

public class PrintArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 2, 3, 34, 5,3,3 };
		int n =0;
	//	printReverseArray(arr, n);
        System.out.println("max "+ max(arr,n));
		System.out.println("min "+min(arr,n));
//		System.out.println("find"+" 3 in array "+find(arr,n,3));
//		System.out.println("find"+" 3 in array "+find2(arr,n,3));
	//System.out.println("findFirstIndex "+findFirstIndex(arr,n,3));
	//System.out.println("findLastIndex"+findLastIndex(arr,n,3));
	int data[]=allIndices(arr,n,3,0);
	for(int d:data)
	{
		System.out.print(d+" ");
	}
	}

	public static void printArray(int a[], int n) {
		if (n < 0) {
			return;
		}
		printArray(a, n - 1);
		System.out.println(a[n]);
		
	}
	public static void printReverseArray(int a[], int n) {
		if (n==a.length) {
			return;
		}

		printReverseArray(a, n + 1);
		System.out.println(a[n]);		
		
		
	}
	
	public static int max(int arr[],int n)
	{
		if(n==arr.length-1)
		{
			return arr[n];
		}
		
		int maxAfterMe=max(arr,n+1);
		if(maxAfterMe>arr[n])
		{
		   return maxAfterMe;
		}
		else {
			return arr[n];
		}
		
			
	}
	public static int min(int arr[],int vidx)
	{
		if(vidx==arr.length-1)
		{
			return arr[vidx];
		}
		int minAfterme=min(arr,vidx+1);
		if(minAfterme<arr[vidx])
		{
			return minAfterme;
		}
		else {
			return arr[vidx];
		}
	}
	
	public static boolean find(int arr[],int vidx,int val)
	{
		if(vidx==arr.length)
		{
			return false;
		}
		boolean findn=find(arr,vidx+1,val);
		if(findn)
		{
			return true;
		}
		else {
			if(arr[vidx]==val)
				
			{
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static boolean find2(int arr[],int vidx,int val)
	{
		if(vidx==arr.length)
		{
			return false;
		}
		if(arr[vidx]==val)
			
		{
			return true;
		}
		
		boolean findn=find2(arr,vidx+1,val);
		return findn;
	}
	
	public static int findFirstIndex(int arr[],int vidx,int val)
	{   if(vidx==arr.length)
	{
		return -1;
	}
		if(arr[vidx]==val)
		{
			return vidx+1;
		}
		int findn=findFirstIndex(arr,vidx+1,val);
	    return findn;
	}
	public static int findLastIndex(int arr[],int vidx,int val)
	
	{   if(vidx==arr.length)
	{
		return -1;
	}
	    int findn=findLastIndex(arr,vidx+1,val);
		if(findn==-1)
		{
			if(arr[vidx]==val)
			{
				return vidx+1;
			}
			else {
				return -1;
			}
		}
		else {
			return findn+1;
		}
		
	}
	
	public static int[] allIndices(int arr[],int vidx,int val,int fsf)
	{
	    if(vidx==arr.length)
	    {
	    	return  new int [fsf];
	    }
	    
	    	if(arr[vidx]==val)
	    	{
	    		int res[]=allIndices(arr,vidx+1,val,fsf+1);
	    		res[fsf]=vidx+1;
	    		return res;
	    	}
	    	else {   
	    		int res[]=allIndices(arr,vidx+1,val,fsf);
	    		return res;
	    	}
	    
	}
}
