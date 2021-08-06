package algorithm;

public class KMPAlgorithm {

    public static void main(String[] args) {

        String question = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        String ans = "ab";
        int[] arr = lps(ans);
        System.out.println(KMP(question, ans, arr));


    }

    public static boolean KMP(String que, String ans, int lps[]) {
        boolean flag = false;

        int n = que.length();//length of questions
        int m = ans.length();//length of pattern
        int i = 0;
        int j = 0;
        while (i < n ) {

            if (que.charAt(i) == ans.charAt(j)) {
                i++;
                j++;

            }
            if (j == m) {
                System.out.println("pattern found at index "+ (i-j));
                // j=lps[j-1];
                flag = true;
            } else if (i < n && que.charAt(i) != ans.charAt(j)) {

                if (j != 0) {
                    j = lps[j-1];
                } else {
                    i++;
                }
            }


        }


        return flag;

    }

    public static int[] lps(String ans) {
        int m = ans.length();
        int lps[] = new int[m];
        int i = 1;
        int len = 0;
        lps[0] = 0;
        while (i < m) {
            if (ans.charAt(i) == ans.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;

    }
}



