
package com.cybage;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String input = sc.next();
		String[] num = input.split("");
		int[] arr = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			arr[i] = Integer.parseInt(num[i]);

		}
		int sum = 0;
		for (int n : arr) {
			sum = n + sum;
		}
		System.out.println("Sum: " + sum);

	}

}
