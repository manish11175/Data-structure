package recursion;

import java.util.ArrayList;

public class GetBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(getPath(0,5));
	}
  public static ArrayList<String> getPath(int curr,int end)
  {
	  if(curr==end)
	  {
	   ArrayList<String>br=new ArrayList<String>();
	   br.add("");
	   return br;
	  }
	  
	  if(curr>end)
	  {
		  ArrayList<String>br=new ArrayList<String>();
		   return br;
		  
	  }
	  ArrayList<String> mr=new ArrayList<String>();
	  for(int dice=1;dice<=6;dice++)
	  {
		  ArrayList<String> rrdice=getPath(curr+dice,end);
		  for(String rs:rrdice)
		  {
			  mr.add(rs+dice);
		  }
	  }

	  return mr;
  }
}
