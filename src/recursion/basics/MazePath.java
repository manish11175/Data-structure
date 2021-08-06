package recursion.basics;
import java.util.*;
public class MazePath {
    public static void main(String args[]){
//        mazePath(1,1,3,3,"");
//        mazePathD(1,1,3,3,"");
//        mazePathJump(1,1,3,3,"");
        mazePathJump1(1,1,3,3,"");
    }
    public static void mazePath(int sr,int sc,int dr,int dc,String ans){

        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sr<dr){
            mazePath(sr+1,sc,dr,dc,ans+"V");
        }
        if(sc<dc){
            mazePath(sr,sc+1,dr,dc,ans+"H");

        }

    }
    public static void mazePathD(int sr,int sc,int dr,int dc,String ans){

        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sr<dr){
            mazePathD(sr+1,sc,dr,dc,ans+"V");
        }
        if(sc<dc){
            mazePathD(sr,sc+1,dr,dc,ans+"H");

        }
        if(sc<dc && sr<dr){
            mazePathD(sr+1,sc+1,dr,dc,ans+"D");
        }

    }
    public static void mazePathJump(int sr,int sc,int dr,int dc,String ans){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sc<dc){
            for(int i=1;i<dc;i++){
                mazePathJump(sr,sc+i,dr,dc,ans+"H"+i);
            }
        }
        if(sr<dr){
            for(int i=1;i<dr;i++){
                mazePathJump(sr+i,sc,dr,dc,ans+"V"+i);
            }
        }
        if(sc<dc && sc<dc){
            for(int i=1,j=1;i<dc && j<dr;i++,j++){
                mazePathJump(sr+j,sc+i,dr,dc,ans+"D"+i);
            }
        }
    }
    public static void mazePathJump1(int sr,int sc,int dr,int dc,String ans){

        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
           for(int i=1;i<=dc-sc;i++){
                mazePathJump1(sr,sc+i,dr,dc,ans+"H"+i);
            }


            for(int i=1;i<=dr-sr;i++){
                mazePathJump1(sr+i,sc,dr,dc,ans+"V"+i);
            }
            for(int i=1;i<=dc-sc && i<=dr-sr;i++){
                mazePathJump1(sr+i,sc+i,dr,dc,ans+"D"+i);
            }

    }
}
