
package com.cybage;

public class Pattern {

	public static void main(String[] args) {

		int x = 5;
		for (int i = 1; i <= x; i = i + 2) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = x - 2; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
