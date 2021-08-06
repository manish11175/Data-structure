package recursion.questionanswerapproach;

public class Gridpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      mazepath(0,0,2,2,"");
	}
	public static void mazepath(int row,int cols,int curr,int end,String ans)
	{
		if(row==curr&& cols==end)
		{
			System.out.println(ans);
			return;
		}
		if(row>curr||cols>end)
		{
         return;			
		}
		mazepath(row+1,cols,curr,end,ans+"V");
		mazepath(row,cols+1,curr,end,ans+"H");
		mazepath(row+1,cols+1,curr,end,ans+"D");
	}

}
