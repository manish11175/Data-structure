package recursion;

import java.util.ArrayList;

public class getKeyPressCombination {

	public static void main(String[] args) {
		System.out.println(getKPC("12"));
     System.out.println();
	}
	
public static ArrayList<String> getKPC(String s)
{
	if(s.length()==0)
		
	{
		ArrayList<String> br=new ArrayList<String>();
		br.add("" );
		return br;
	}
	char ch=s.charAt(0);
	String ros=s.substring(1);
	ArrayList<String> rr=getKPC(ros);
	ArrayList<String> mr=new ArrayList<String>();
	String choice=getChoice(ch);
	for(String rs:rr)
	{
		for(int i=0;i<choice.length();i++)
		{
			String ms=rs+
					choice.charAt(i);
		
			mr.add(ms);
		}
	}
	return mr;
	
}

public static String getChoice(char key)
{
	if(key=='1')
	{
		return ("abc");
	}
	else if(key=='2')
	{
		return "def";
	}
	return "";
}

}
