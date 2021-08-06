package recursion.basics;

public class NQueen {
   public static void main(String args[]){
       int row=4;
       int chess[][]=new int [row][row];
       printNQueen(chess,0,"");

   }
   public static void printNQueen(int [][]arr,int row,String qsf){
       if(row== arr.length ){
          System.out.println(qsf);
           return;
       }

       for(int j=0;j<arr[0].length;j++){
           if(ifSafe(arr,row,j)){
               arr[row][j]=1;
               printNQueen(arr,row+1,qsf+row+" "+j+", ");
               arr[row][j]=0;
           }


       }
   }
   public static boolean ifSafe(int arr[][],int row,int col){

       int i=row-1;
       int j=col;
       while(i>=0 ){
           if(arr[i][j]==1){
               return false;
           }
           i--;
       }
       i=row-1;
       j=col-1;
       while (j>=0 && i>=0){
           if(arr[i][j]==1){
               return false;
           }
           i--;
           j--;
       }
       i=row-1;
       j=col+1;
       while (j<arr[0].length && i>=0){
           if(arr[i][j]==1){
               return false;
           }
           i--;
           j++;
       }

       return true;
   }
}
