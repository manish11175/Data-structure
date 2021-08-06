package questions;
import java.util.*;
public class CustomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="abcdef";
      String arr[]= {"abc","def","acd"};
      parseString(str,arr);
	}

public static void  parseString(String str,String[] arr) {
		HashSet <String> set = new HashSet<>();
		
		for(String str2:arr) {
			set.add(str2);
		}
		for(int i=0;i<str.length();i++) {
			
			for(int j=i;j<str.length();j++) {
				
				String str1=str.substring(i,j+1);
				System.out.println(str1);
			}
			
		}
		
		//System.out.println(set);
		
	}

}
