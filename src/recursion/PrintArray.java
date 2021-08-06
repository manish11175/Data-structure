package recursion;

import java.util.ArrayList;

public class PrintArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 ,4,5};
		int i = 0;
		int val = 4;
        
      System.out.println(getsubSeq("abcd"));
//		int ans = findLastIndex(arr, i, val);
//		System.out.println(ans);
//		int temp[]=allIndice(arr,0,val,0);
//		for(int t:temp)
//		{
//			System.out.print(t+","								);
//		}
				
	}

	public static void print(int arr[], int i) {

		if (arr.length == i) {
			return;
		}
		System.out.println(arr[i]);
		print(arr, i + 1);
		
	}

	public static int findLastIndex(int arr[], int idx, int val) {
		if (idx == arr.length) {
			return -1;
		}
		int foundIdx = findLastIndex(arr, idx + 1, val);
		if (foundIdx == -1) {
			if (arr[idx] == val) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return foundIdx;
		}
	}

	public static int[] allIndice(int arr[], int idx, int val, int fsf) {
     
		if(idx==arr.length)
		{
			return new int[fsf];
		}
		if(arr[idx]==val)
		{
			int[] aia=allIndice(arr,idx+1,val,fsf+1);
			
		     aia[fsf]=idx;
		     return aia;
		}
		else
		{
			int[] aia=allIndice(arr,idx+1,val,fsf);
		    return aia;	
		}
		
	}
	
	
	public static ArrayList<String> getsubSeq(String s)
	{  
		if(s.length()==0)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
			
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		System.out.println(ros);
		ArrayList<String> rr=getsubSeq(ros);
		ArrayList<String> mr=new ArrayList<String>();
		for(String rs:rr)
		{
			mr.add(rs);
			mr.add(ch+rs);
		}
		return mr;
	}
}
