package pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		diamond(n);

	}

	public static void diamond(int n) {
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int cols = 1;

		while (row <= n * 2 - 1) {

			cols = 1;
			while (cols <= nsp) {
				System.out.print(" ");
				cols++;
			}

			cols = 1;
			while (cols <= nst) {
				System.out.print("*");
				cols++;
			}

			System.out.println();

			if (row < n) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
			row++;

		}
	}

}
