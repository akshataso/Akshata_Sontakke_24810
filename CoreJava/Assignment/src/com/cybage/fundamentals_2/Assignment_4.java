
package com.cybage.fundamentals_2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int[] arr = new int[scanner.nextInt()];
		System.out.println("Enter index: ");
		int index = scanner.nextInt();
		System.out.println("Enter element: ");
		int data = scanner.nextInt();

		arr[index] = data;
		System.out.println(Arrays.toString(arr));

	}

}
