package recursion.basics;

public class FloodFill {
    public static void main(String args []){
       int board[][]={
               {0,1,1,1,1},
               {0,0,0,0,1},
               {1,0,1,0,0},
               {0,1,1,1,0},
               {1,0,0,0,0}
       };
       fillFlood(board,0,0,"",new boolean[board.length][board[0].length]);

    }
    public static void fillFlood(int maze[][],int row,int col,String psf,boolean visited[][]){

        if(row<0  || col<0 || col==maze[0].length || row==maze.length || maze[row][col]==1||visited[row][col] ){
            return;
        }

        if(row==maze.length-1 && col==maze[0].length-1 ){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;

        fillFlood(maze,row-1,col,psf+"Up ",visited);
        fillFlood(maze,row,col-1,psf+"Left ",visited);
        fillFlood(maze,row+1,col,psf+"Down ",visited);
        fillFlood(maze,row,col+1,psf+"Right ",visited);
    }
}
