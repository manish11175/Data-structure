package recursion.basics;

import TwoDArray.A;

import java.util.ArrayList;

public class GoldMine2 {
    public static int max=0;
    public static void main(String args[]){
        int mines[][]={
                {10,0,100,200,0,8,0},
                {20,0,0,0,0,6,0},
                {30,0,0,0,12,3,4},
                {40,0,2,5,8,3,11},
                {0,0,0,0,0,9,0},
                {5,6,7,0,7,4,2},
                {8,9,10,0,1,10,800}
        };
        collectGold(mines);
        System.out.println(max);

    }
    public static void collectGold(int mines[][]){
        boolean visted[][]=new boolean[7][7];
        for(int i=0;i< mines.length;i++){
            for(int j=0;j<mines[0].length;j++){
                if(mines[i][j]!=0 && !visted[i][j]){
                    ArrayList<Integer>bag=new ArrayList<>();
                    goldMine(mines,i,j,visted,bag);
                    System.out.println(bag);
                    int sum=0;
                    for(int val:bag){
                        sum+=val;
                    }
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
    }
    public static void goldMine(int [][]mines,int i,int j,boolean visited[][],ArrayList<Integer> bag){
        if(i== mines.length || i<0|| j<0|| j==mines[0].length||mines[i][j]==0 || visited[i][j]){
            return;
        }


        visited[i][j]=true;
        bag.add(mines[i][j]);
        goldMine(mines,i+1,j,visited,bag);
        goldMine(mines,i,j+1,visited,bag);
        goldMine(mines,i,j-1,visited,bag);
        goldMine(mines,i-1,j,visited,bag);

    }
}
