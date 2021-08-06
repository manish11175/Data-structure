package recursion.questionanswerapproach;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    permutationOfString("abc"," ");
	}

	
	
	public static void permutationOfString(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
	
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			String roq=ques.substring(0,i)+ques.substring(i+1);
			permutationOfString(roq,ans+ch);
		}
		
	}
}
