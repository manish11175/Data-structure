package recursion;

public class Permutation {
  public static void main(String[] args)
  {	 System.out.println("permutation is");
	  permutation("abc","");
	 
  }
  public  static void permutation(String ques,String ans)
  {
	  if(ques.length()==0)
	  {
		  System.out.println(ans);
		  return;
	  }
	  for(int i=0;i<ques.length();i++)
	  {
	      char ch=ques.charAt(i);
		  String ros=ques.substring(0,i)+ques.substring(i+1);
		  permutation(ros,ans+ch);
	  }
  }
  public static void getKPC(String ques,String ans)
  {
	  if(ques.length()==0)
	  {
		  System.out.println(ans);
		  return;
	  }
	  char ch=ques.charAt(0);
	  String key=getchar(ch);
	  String ros=ques.substring(1);
			  
	  for(int i=0;i<key.length();i++)
	  {
		  getKPC(ros,ans+key.charAt(i));
	  }
  }
  public static String getchar(char key)
  {
	  if(key=='1')
	  {
		  return "abc";
	  }
	  else {
		  return "def";
	  }
  }
}
