package oops;

public class ReverseString {

	public static void main(String[] args) {
      String inStr=" My name is   manishhh      dffgvb dffd ";
      int i=inStr.length()-1;
      String ans="";
      while(i>=0)
      {
    	  while(i>=0 && inStr.charAt(i)==' ') i--;
    	  int j=i;
    	  if(i<0) break;
    	  while(i>=0 && inStr.charAt(i)!=' ') i--;
    	  if(ans.isEmpty())
    	  {
    		 ans=ans.concat(inStr.substring(i+1,j+1));
    	  }
    	  else{
    		  ans=ans.concat(" "+ inStr.substring(i+1,j+1));
    	  }
    	
      }
      System.out.print(ans);
      
	}

}
