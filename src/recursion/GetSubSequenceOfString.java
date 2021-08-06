package recursion;

import java.util.ArrayList;

public class GetSubSequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abcde"));

	}
	public static ArrayList<String> getSS(String s){
		
		if(s.length()==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
		}
		char ch=s.charAt(0);
		String ros=s.substring(1);
		ArrayList<String> rr=getSS(ros); 
		ArrayList<String> mr=new ArrayList<>();
		for(String rs:rr)
		{
			mr.add(rs);
			mr.add(ch+rs);
		}
		
		return mr;
	}

}
