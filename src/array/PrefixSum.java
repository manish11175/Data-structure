package array;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i == 0) {
				sum[i] = arr[i];

			} else {
				sum[i] = sum[i - 1] + arr[i];
			}
		}
		
		System.out.println("Enter the number of Query");
		int q=sc.nextInt();
		while(q>0)
		{ q--;
			int l=sc.nextInt();
			int r=sc.nextInt();
			
			if(l<0 ||r<0 || l>n-1 || r>n-1)
			{
			System.out.println("invalid inputs");	
			}
			else if(l==r)
			{
				System.out.println(arr[l]);
			}
			else if(l==0)
			{
				System.out.println(sum[r]);
			}
			else{
				System.out.println(sum[r]-sum[l-1]);
			}
			
		}
			

	}

}


//prifix sum 1 2 3 4-> 1 1+2 1+2+3 1+2+3+4
              //       1  3    6      10+++

