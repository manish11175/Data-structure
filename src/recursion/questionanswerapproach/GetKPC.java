package recursion.questionanswerapproach;

public class GetKPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      getKPC("12","");
	}
	
	public static void getKPC(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
	  char ch=ques.charAt(0);
	  String ros=ques.substring(1);
	  String keytext=getKey(ch);
	  for(int i=0;i<keytext.length();i++)
	  {
		  getKPC(ros,ans+keytext.charAt(i));
	  }
	}
	public static String getKey(char key)
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
