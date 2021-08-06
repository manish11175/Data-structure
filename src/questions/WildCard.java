package questions;

public class WildCard {

	public static void main(CustomString[] args) {
		// TODO Auto-generated method stub
   String s="baaabab";
   String p="a**";
   System.out.println(match(s,p));
 
	}
   public static boolean match(String text,String pattern)
   {
	   if(text.length()==0 && pattern.length()==0)
	   {
		   return true;
	   }
	   if(text.length()!=0 && pattern.length()==0)
	   {
		   return false;
	   }
	   if(text.length()==0 && pattern.length()!=0)
	   {
		   if(pattern.charAt(0)=='*')
		   {
			   return match(text,pattern.substring(1));
		   }
		   return false;
	   }
	   if(pattern.charAt(0)=='*')
	   {
		   boolean ans1,ans2;
		   ans1=match(text,pattern.substring(1));
		   ans2=match(text.substring(1),pattern);
		   return ans1||ans2;
	   }
	   else {
		   if(text.charAt(0)!=pattern.charAt(0) && pattern.charAt(0)!='?')
		   {
			   return false;
		   }
		   else {
			   return match(text.substring(1),pattern.substring(1));
		   }
	   }
   }
}
