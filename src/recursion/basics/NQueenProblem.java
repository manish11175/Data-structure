package recursion.basics;

public class NQueenProblem {
public static void main(String args[]){
    int row=7;
    int chess[][]=new int[row][row];
    nQueen(chess,0,"");
}
public static int count=0;
public static void nQueen(int chess[][],int row,String qsf){

    if(row== chess.length){
        System.out.println(++count);
        System.out.println(qsf);
        return;
    }
    for(int cols=0;cols<chess[0].length;cols++){
        if(isSafe(chess,row,cols)) {
            chess[row][cols] = 1;
            nQueen(chess, row + 1, qsf + row + " " + cols + ", ");
            chess[row][cols] = 0;
        }
    }
}
public static boolean isSafe(int chess[][],int row,int cols){
    for(int i=row-1,j=cols;i>=0;i--){
        if(chess[i][j]==1){
            return false;
        }
    }
    for(int i=row-1,j=cols-1;i>=0 && j>=0;i--,j--){
        if(chess[i][j]==1){
            return false;
        }
    }
    for(int i=row-1,j=cols+1;i>=0 && j<chess[0].length;j++,i--){
        if(chess[i][j]==1){
            return false;
        }
    }
    return true;
}
}
