package arraypractice;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
      
        Stack<Integer> stack = new Stack();
        stack.push(0);

        for (char c: string.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2 * v, 1));
            }
        }

        int res= stack.pop();
        System.out.println(res);
        
    }
}