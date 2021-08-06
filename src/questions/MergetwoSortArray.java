package questions;
import java.util.*;

public class MergetwoSortArray {

	public static void main(CustomString[] args) {
		
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(2);
		list2.add(3);
    
		System.out.println(mergearray(list1,list2));
		
	}
	
	public static ArrayList<Integer> mergearray(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		
		ArrayList<Integer> ans=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<list1.size()&& j<list2.size())
		{
			if(list1.get(i)<list2.get(j))
			{
				ans.add(list1.get(i));
				i++;
			}
			else
			{
				ans.add(list2.get(j));
				j++;
			}
		}
		while(i<list1.size())
		{
			ans.add(list1.get(i));
			i++;
		}
		while(j<list2.size())
		{
			ans.add(list2.get(j));
			j++;
		}
			
		return ans;
	}

}
