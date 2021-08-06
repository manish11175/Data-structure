package recursion.questionanswerapproach;

public class Nqeen {

	public static void main(String[] args) {
        boolean [][]board=new boolean[4][4];
	
        printNQueen(board,0,"");
	}

	public static void printNQueen(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueen(board, row + 1, ans + "[" + row + "-" + col + "]");
				board[row][col] = false;
			}
		}

	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		//columns 
		for(int i=0;i<row;i++)
		{
			if(board[i][col]==true)
			{
				return false;
			}
		}
		// diagonal1
		
		int r=row-1;
		int c=col-1;
		while(r>=0 && c>=0)
		{
			if(board[r][c]==true)
			{
				return false;
			}
			r--;
			c--;
		}
		 r=row-1;
		c=col+1;
		while(r>=0&&c<board.length)
		{
			if(board[r][c]==true)
			{
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
}
