
package com.cybage.fundamentals.assign_4;

import java.util.Scanner;

public class NumerSeparate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter non-negative number:  ");
		int input = scanner.nextInt();
		
		String[] arr = Integer.toString(input).split("");

		for (String str : arr) {
			System.out.print(str + " ");
		}

	}

}
