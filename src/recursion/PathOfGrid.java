package recursion;

public class PathOfGrid {

	public static void main(String[] args) {
//		System.out.println(gridNo(2,2));
        System.out.println(getMazePathDiagonal(3,3));
	}
	public static int gridNo(int n,int m)
	{
		if(n==1||m==1)
		{
			return 1;
		}
		
		return gridNo(n,m-1)+gridNo(m,n-1);
	}
	public static int getMazePathDiagonal(int n,int m)
	{
		if(n==1||m==1)
		{
			return 1;
		}
		
		return getMazePathDiagonal(n,m-1)+getMazePathDiagonal(m,n-1)+getMazePathDiagonal(m-1,n-1);
	}
  
}
