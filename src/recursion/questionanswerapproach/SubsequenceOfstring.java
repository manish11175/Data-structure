package recursion.questionanswerapproach;

public class SubsequenceOfstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         getSS("abc","");
	}

	public static void getSS(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
			
		}
		
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
		getSS(ros,ans+ch);
		getSS(ros,ans);
		
	}
}
