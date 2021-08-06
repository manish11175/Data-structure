package recursion.questionanswerapproach;

public class Sudoko {

	public static void main(String[] args) {
		
		int board[][]={ 
				 {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		System.out.println(sudokuSolve(board));		

	}

	public static boolean sudokuSolve(int[][] board) {
		int row = -1;
		int cols = -1;
		boolean isFilled = true;
		outer: for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 0) {
					row = i;
					cols = j;
					isFilled = false;
					break outer;

				}
			}
		}
		if(isFilled)
		{
			//print board
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board[0].length;j++)
				{
					System.out.print(board[i][j]+"\t");
				}
				System.out.println();
			}
			return true;
		}
		for (int k = 1; k <= 9; k++) {
			if (isSafeSudoku(k, row, cols, board)) {
				board[row][cols] = k;
				if (sudokuSolve(board) == true) {
					return true;
				} else {
					board[row][cols] = 0;
				}
			}
		}

		return false;
		
		
	}
	private static boolean isSafeSudoku(int k,int row,int cols,int [][]board)
	{
		for(int i=0;i<=row;i++)
		{
			if(board[i][cols]==k)
			{
				return false;
			}
		}
		for(int j=0;j<=cols;j++)
		{
			if(board[row][j]==k)
			{
				return false;
			}
		}
		int sqrt=(int)Math.sqrt(board.length);
		int boxRowStart=row-row%sqrt;
		int boxColStart=cols-cols%sqrt;
		for(int i=boxRowStart;i<boxRowStart+sqrt;i++)
		{
			for(int j=boxColStart;j<boxColStart+sqrt;j++)
			{
				if(board[i][j]==k)
				{
					return false;
				}
			}
		}
				
		return true;
				
				
	}
	
}
