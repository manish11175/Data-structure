package questions;

public class longestPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(LPS("aa"));
	}

	public static int LPS(String s) {

		int max = 1;
		int ss=0;
		int e=0;

		for (int i = 0; i < s.length(); i++) {
			int l = i - 1;
			int r = i + 1;

			while (l >= 0 && r < s.length()) {
                
				if(s.charAt(l)!=s.charAt(r)) {
					break;
				}
				if(max<(r-l+1)) {
				ss=l;
				e=r;
				}
				max=Math.max(max, r-l+1);
                l--;
                r++;
                
             }
		
		}
		for (int i = 0; i < s.length(); i++) {
			int l = i - 1;
			int r = i;

			while (l>= 0 && r < s.length()) {
                
				if(s.charAt(l)!=s.charAt(r)) {
					break;
				}
				if(max<(r-l+1)) {
				ss=l;
				e=r;
				}
				max=Math.max(max, r-l+1);

                l--;
                r++;
             }

		}
		System.out.println(s.substring(ss,e+1));
       return max;
	}

}
