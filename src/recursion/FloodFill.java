package recursion;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
		int row = a.length;
		int cols = a[0].length;

		if (r < 0 || r >= row || c < 0 || c >= cols) {
			return;

		}
		if(a[r][c]!=prevFill)
		{
			return;
		}
		floodFill(a,r-1,c,toFill,prevFill);
	    floodFill(a,r,c-1,toFill,prevFill);
	    floodFill(a,r+1,c,toFill,prevFill);
	    floodFill(a,r,c+1,toFill,prevFill);
	}
}
