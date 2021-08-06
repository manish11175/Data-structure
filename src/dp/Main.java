package dp;

public class Main {
    public static void main(String[] args) {
//        int n=4;
//        int strg[]=new int[n+1];
//     System.out.print(climbDown(n,strg));
//        climbDownTabulation(3);
        //System.out.print(countMazePath(3,3));
//        mazeSD(0, 0, 2, 2);

//     int arr[]={1,3,5,8,9,2,6,7,6,8,9};
//    System.out.println("min jump is "+minJumps(arr));
//    System.out.print("hello");
//
//        int coins[]={2,3,5};
//
      //System.out.println(coinChangeComb(coins,7));
//        int arr[]={0,3,5,6,15,10,25,12,24};
//        System.out.println(rodCutting(arr));
//        int arr[]={13,15,100,5,10,60,10,100,51};
//
//        System.out.println(MaxSumAdja(arr));
//        LongestPalindromeSubstring("abccba");
//        int floors = 10;
//        int eggs = 2;
//     System.out.println(eggsDrop(eggs, floors, new int[eggs + 1][floors + 1]));
//
//   String str="geek";
//   String str1="geeks";
//   System.out.println(editDistance(str,str1,str.length(),str1.length()));

        int  value[]={10,80,50,20};
        int weight[]={1,2,3,5};
        int target=8;
        int n=weight.length;
        int cache[][]=new int[n+1][target+1];
//        System.out.println(knap(target,weight,value,n,cache));
    System.out.println(knaptab(weight,value,target));
    }


    public static int knaptab(int weight[],int value[],int target){
        int dp[][]=new int[weight.length+1][target+1];
        for(int i=0;i<=weight.length;i++){
            for(int j=0;j<=target;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=0;
                }
                else{
                    if(j>=weight[i-1]){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }

            }

        }
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[weight.length][target];
    }
    public static int knap(int w,int []weight,int[] value,int n){
        if(n==0||w==0) {
         return 0;
        }
        if(weight[n-1]>w){
           int excluding =knap(w,weight,value,n-1);
           return excluding;
        }
        int excluding=value[n-1]+knap(w-weight[n-1],weight,value,n-1);
       int including= knap(w,weight,value,n-1);
       return Math.max(excluding,including);
    }



    public static int knap(int w,int []weight,int[] value,int n,int cache[][]){
        if(n==0||w==0) {
            return 0;

        }
        if(cache[n][w]!=0){
            return cache[n][w];
        }
        if(weight[n-1]>w){
            return knap(w,weight,value,n-1,cache);
        }

        int x=value[n-1]+knap(w-weight[n-1],weight,value,n-1,cache);
        int y= knap(w,weight,value,n-1,cache);
        return cache[n][w]=Math.max(x,y);
    }
    //    public  static int  fibo(int n){
//        if(n==1 ||n==2){
//            return n-1;
//
//        }
//    }


    public static void LongestPalindromeSubstring(String str) {
        int n = str.length();
        int lps = 0;
        boolean cache[][] = new boolean[n][n];
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; j++, i++) {
                if (gap == 0) {
                    cache[i][j] = true;
                    lps = 1;
                } else if (gap == 1) {
                    if (str.charAt(i) == str.charAt(j)) {
                        cache[i][j] = true;
                        lps = 2;
                    }
                } else {
                    if (str.charAt(i) == str.charAt(j)) {
                        cache[i][j] = cache[i + 1][j - 1];

                        if (cache[i + 1][j - 1] == true) {
                            lps = j - i + 1;
                        }

                    }
                }
            }

        }
        System.out.println(lps);
    }

    public static  int editDistance(String str1,String str2,int n,int m){

        if(m==0){
            return n;

        }
        if(n==0){
            return m;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return editDistance(str1,str2,n-1,m-1);
        }
        else{
            return 1+Math.min(editDistance(str1,str2,n-1,m),Math.min(editDistance(str1,str2,n,m-1),editDistance(str1,str2,n-1,m-1)));

        }

    }




    public static int eggsDrop(int e, int f, int cache[][]) {
        if (f == 0) {
            return 0;
        }
        if (f == 1) {
            return 1;
        }
        if (e == 1) {
            return f;
        }
        if (cache[e][f] != 0) {
            return cache[e][f];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= f; i++) {
            min = Math.min(min, Math.max(eggsDrop(e - 1, i - 1, cache), eggsDrop(e, f - i, cache)));

        }
        return cache[e][f]=min + 1;
    }

    public static int MaxSumAdja(int arr[]) {
        int cache[][] = new int[2][arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                cache[0][i] = 0;
                cache[1][i] = arr[i];
            } else {
                cache[0][i] = Math.max(cache[0][i - 1], cache[1][i - 1]);
                cache[1][i] = arr[i] + cache[0][i - 1];
            }

        }

        return Math.max(cache[0][cache[0].length - 1], cache[1][cache[0].length - 1]);
    }

    public static int climbDown(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        return climbDown(n - 1) + climbDown(n - 2) + climbDown(n - 3);

    }

    public static int climbDown(int n, int strg[]) {
        if (n < 0) {
            return 0;
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        if (strg[n] != 0) {
            return strg[n];
        }
        return strg[n] = climbDown(n - 1) + climbDown(n - 2) + climbDown(n - 3);

    }

    public static void climbDownTabulation(int n) {
        int strg[] = new int[n + 1];
        strg[0] = 1;
        strg[1] = 1;
        strg[2] = 2;
        for (int i = 3; i <= n; i++) {
            strg[i] = strg[i - 1] + strg[i - 2] + strg[i - 3];

        }
        System.out.print(strg[n]);
    }

    public static void mazeSD(int row, int col, int i, int j) {
        int arr[][] = new int[i + 1][j + 1];

        arr[i][j] = 1;
        arr[i][j - 1] = 1;
        arr[i - 1][j] = 1;
        arr[i - 1][j - 1] = 2;

        for (int k = i; k >= 0; k--) {
            for (int l = j; l >= 0; l--) {
                if (k == i && l == j) {
                    arr[k][l] = arr[i][j];
                }
                if (k == i) {
                    arr[k][l] = arr[k][l + 1];
                } else if (l == j) {
                    arr[k][l] = arr[k + 1][l];
                } else {
                    arr[k][l] = arr[k + 1][l] + arr[k][l + 1];
                }

            }
        }

        System.out.print(arr[row][col]);

    }

    public static boolean TargetSumSubset(int[] arr, int target) {
        boolean[][] strg = new boolean[arr.length + 1][target + 1];
        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < strg[0].length; j++) {
                if (i == 0 && j == 0) {
                    strg[i][j] = true;
                } else if (i == 0) {
                    strg[i][j] = false;
                } else if (j == 0) {
                    strg[i][j] = true;
                } else {
                    if (strg[i - 1][j]) {
                        strg[i][j] = true;
                    } else {
                        if (j - arr[i - 1] >= 0) {
                            strg[i][j] = strg[i - 1][j - arr[i - 1]];
                        }
                    }
                }
            }
        }

        return strg[strg.length - 1][strg[0].length - 1];
    }

    public static int countMazePath(int dr, int dc) {
        int strg[][] = new int[dr + 1][dc + 1];

        for (int i = 0; i <= dr; i++) {
            for (int j = 0; j <= dc; j++) {
                if (i == 0 && j == 0) {
                    strg[i][j] = 1;
                } else if (i == 0) {
                    strg[i][j] = strg[i][j - 1];

                } else if (j == 0) {
                    strg[i][j] = strg[i - 1][j];

                } else {
                    strg[i][j] = strg[i - 1][j] + strg[i][j - 1];
                }
            }
        }
        return strg[dr][dc];
    }


//    public static int castMazePath(int arr[][]) {
//        int cast;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//
//            }
//        }
//
//    }
//
//    public static int goldMine(int arr[][]){
//        int goldTable[][]=new int[arr.length][arr[0].length];
//
//        for(int i=0;i<arr.length;i++){
//            goldTable[i][arr[0].length]=arr[i][arr[0].length];
//        }
//        for(int i=arr[0].length-2;i>=0;i--){
//            for(int j=0;j<arr.length;j++){
//
//                goldTable[i][j]=Math.max(arr[i][j],arr[i][j+1]);
//
//            }
//        }
//    }

    public static int minJump(int arr[]) {

        int n = arr.length;
        int strg[] = new int[n];

        strg[0] = 0;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {

                if (arr[j] >= i - j) {
                    min = Math.min(min, strg[j] + 1);
                }

            }
            strg[i] = min;
        }
        return strg[strg.length - 1];
    }

    public static int minJumps(int arr[]) {
        int jumps[] = new int[arr.length];

        jumps[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] >= i - j) {
                    min = Math.min(min, jumps[j] + 1);
                }
            }
            jumps[i] = min;
        }
        return jumps[jumps.length - 1];
    }

    public static int rodCutting(int arr[]) {

        int cache[] = new int[arr.length];
        cache[0] = arr[0];
        cache[1] = arr[1];

        for (int i = 2; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1, c = i - 1; j <= c; j++, c--) {
                max = Math.max(max, cache[j] + cache[c]);
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            cache[i] = max;
        }
        return cache[cache.length - 1];
    }

//    public static void targetSumSubset(int arr[],int target){
//        int cache[]=new int[arr.length];
//
//    }


    public static int coinChangePermu(int arr[], int target) {
        int cache[] = new int[target + 1];
        cache[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i - arr[j] >= 0) {
                    cache[i] += cache[i - arr[j]];
                }
            }

        }
        return cache[target];
    }

    public static int coinChangeComb(int arr[], int target) {
        int cache[] = new int[target + 1];
        cache[0] = 1;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i <= target; i++) {

                if (i - arr[j] >= 0) {
                    cache[i] += cache[i - arr[j]];
                }
            }

        }
        return cache[target];
    }

    public static boolean targetSumSubset(int arr[], int target) {

        boolean cache[][] = new boolean[arr.length][target + 1];
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                if (i == 0 && j == 0) {
                    cache[i][j] = true;
                } else if (i == 0) {
                    cache[i][j] = false;
                } else if (j == 0) {
                    cache[i][j] = true;
                } else {
                    if (cache[i - 1][j]) {
                        cache[i][j] = true;
                    } else {
                        if (j - arr[i - 1] >= 0) {
                            cache[i][j] = cache[i - 1][j - arr[i - 1]];
                        }
                    }
                }
            }
        }
        return cache[cache.length - 1][cache[0].length - 1];
    }
}
