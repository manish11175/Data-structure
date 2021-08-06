package recursion.questionanswerapproach;

import java.util.HashSet;

public class WordBreakingProblem {

	public static void main(String[] args) {
	
      String word="i"
      		+ ""
      		+ "";
      HashSet<String> dictionary=new HashSet<>();
      dictionary.add("i");
      dictionary.add("like");
      dictionary.add("sam");
      dictionary.add("sung");
      dictionary.add("mango");
      dictionary.add("man");
      dictionary.add("ice");
      dictionary.add("icecream");
      wordBreak(word,"",dictionary);
	}
   public static void wordBreak(String word,String ans,HashSet<String> dictionary)
   {
	   if(word.length()==0)
	   {
		   System.out.println(ans);
		   return;
	   }
	   for(int i=0;i<=word.length();i++)
	   {
		   String cutString=word.substring(0, i);
		   if(dictionary.contains(cutString))
		   {
			   String roq=word.substring(i);
			   wordBreak(roq,ans+" "+cutString,dictionary);
		   }
	   }
	   
   }
}	
