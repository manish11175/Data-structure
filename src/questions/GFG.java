package questions;


import java.util.Arrays; 


public class GFG  
{ 
	
	
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		
	   String s="30411367001212";

	   char ch[]=s.toCharArray();
	   char ch1[]=ch;
	   Arrays.sort(ch);
	   Arrays.sort(ch1);
	   reverse(ch1);
	   System.out.println(ch);
	   System.out.println(ch1);
	}

    static void reverse(char[] a)  
    { 
        int i, n = a.length; 
        char t; 
        for (i = 0; i < n / 2; i++)  
        { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void primeFactors(long n) 
//    { 
//		
//		long result=0;
//        
//        while (n%2==0) 
//        { 
//            result=2;
//            n /= 2; 
//        } 
//  
//        // n must be odd at this point.  So we can 
//        // skip one element (Note i = i +2) 
//        for (long i = 3; i <= Math.sqrt(n); i+= 2) 
//        { 
//            // While i divides n, print i and divide n 
//            while (n%i == 0) 
//            { 
//                result^=i; 
//                n /= i; 
//            } 
//        } 
//  
//        // This condition is to handle the case whien 
//        // n is a prime number greater than 2 
//        if (n > 2) 
//            result^=n;
//       System.out.println(result);
//    } 
//  
//    public static void main (String[] args) 
//    { 
//       long n =10; 
//        primeFactors(n); 
//    } 
    

} 