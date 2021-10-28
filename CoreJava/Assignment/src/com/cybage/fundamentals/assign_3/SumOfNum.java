
package com.cybage.fundamentals.assign_3;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number from 0 to 1000: ");
		String input = sc.next();
		if(Integer.parseInt(input)<0 || Integer.parseInt(input) >1000) {
			System.out.println("Wrong input");
			System.exit(0);
		}
		String[] num = input.split("");
		int[] arr = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			arr[i] = Integer.parseInt(num[i]);

		}
		int sum = 0;
		for (int n : arr) {
			sum = n + sum;
		}
		System.out.println("Sum of all digits in "+input+" is: " + sum);

	}

}
