
package com.cybage;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = arr.length - 1; i >= 7; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
