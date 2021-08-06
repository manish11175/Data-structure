package recursion.basics;

import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isSafe(int [][]board,int r1,int c1,int r2,int c2,boolean[][] visited){

        if(r1<0|| c1<0 || r1>r2 || c1>c2 || visited[r1][c1]|| board[r1][c1]==0)
        {
            return false;
        }

        if(r1==r2 && c1==c2 && board[r1][c1]==1){
            return true;
        }




        visited[r1][c1]=true;
        if(isSafe(board,r1+1,c1,r2,c2,visited)){
            return true;
        }
        if(isSafe(board,r1-1,c1,r2,c2,visited)){
            return true;
        }

        if(isSafe(board,r1,c1-1,r2,c2,visited)){
            return true;
        }
        if(isSafe(board,r1,c1+1,r2,c2,visited)){
            return true;
        }
        visited[r1][c1]=false;
        return false;








    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        boolean visited[][]=new boolean[n][m];
        if(isSafe(arr,r1,c1,r2,c2,visited)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
