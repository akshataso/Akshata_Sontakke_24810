
package com.cybage;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int i, m = 0;
		boolean stat = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println("Not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("Not a prime number");
					stat = true;
					break;
				}
			}
			if (!stat) {
				System.out.println("Prime number");
			}
		}
		sc.close();
	}

}
