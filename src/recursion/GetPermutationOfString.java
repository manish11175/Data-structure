package recursion;

import java.util.ArrayList;

public class GetPermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(getPerm("abc"));
	}
  public static ArrayList<String> getPermu(String s)
  {
	  if(s.length()==0)
	  {
		  ArrayList<String>br=new ArrayList<>();
		  br.add("");
		  return br;
	  }
	  char ch=s.charAt(0);
	  String ros=s.substring(1);
	  ArrayList<String> rr=getPermu(ros);
	  ArrayList<String> mr=new ArrayList<>();
	  for(String rs:rr)
	  {
		  for(int i=0;i<=rs.length();i++)
		  {
		    String ms=rs.substring(0,i)+ch+rs.substring(i);
		      mr.add(ms);
		  }
		 
	  }
	  return mr;
  }
  
  public static ArrayList<String> getPerm(String s)
  {
	  if(s.length()==0)
	  {
		  ArrayList<String>br=new ArrayList<>();
		  br.add("");
		  return br;
	  }
	  
	  char ch=s.charAt(0);
	  String ros=s.substring(1);
	  ArrayList<String> rr=getPerm(ros);
	  ArrayList<String> mr=new ArrayList<>();
	  for(String rs:rr)
	  {
		  for(int i=0;i<=rs.length();i++)
		  {
			  String ms=rs.substring(0,i)+ch+rs.substring(i);
			  mr.add(ms);
		  }
	  }
	  return mr;
  }
}
