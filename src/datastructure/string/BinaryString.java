package datastructure.string;

public class BinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated     method stub
     binary("0110?0?1?","",0);
	}
    public static void binary(String ques,String ans,int vidx)
    {
    	if(vidx==ques.length())
    	{
    		System.out.println(ans);
    		return;
    	}
    	char ch=ques.charAt(vidx);
    	if(ch!='?')
    	{
    		binary(ques,ans+ch,vidx+1);
    	}
    	else {
    		binary(ques,ans+"0",vidx+1);
    		binary(ques,ans+"1",vidx+1);
    		
    	}
    }
}
