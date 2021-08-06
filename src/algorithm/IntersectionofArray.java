package algorithm;
import java.util.*;
//Intersaction using two pointer
public class IntersectionofArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(4);
		arr1.add(4);
		
		ArrayList<Integer> arr2=new ArrayList<>();
		arr2.add(3);
		arr2.add(4);
		arr2.add(4);
		arr2.add(4);
		arr2.add(5);
		intersection(arr1,arr2);
		

	}
	public static void intersection(ArrayList<Integer> arr1,ArrayList<Integer> arr2)
	{
		int i=0,j=0;
		ArrayList<Integer> ans=new ArrayList<>();
		while(i<arr1.size() && j<arr2.size()) {
			
			if(arr1.get(i)==arr2.get(j))
			{
				ans.add(arr1.get(i));
				j++;
				i++;
			}
			else if(arr1.get(i)<arr2.get(j))
				i++;
			else if(arr2.get(j)<arr1.get(i))
				j++;
		}
		System.out.println(ans);
	}

}
