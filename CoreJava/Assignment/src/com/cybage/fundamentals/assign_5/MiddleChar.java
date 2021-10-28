
package com.cybage.fundamentals.assign_5;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.next();
		int index = input.length()/2;
		if(input.length()%2==0) {
			//even
			System.out.println("Middle Character of "+input+" is: "+input.charAt(index-1));
			
		}else {
			//odd
			System.out.println("Middle Character of "+input+" is: "+input.substring(index-1,index+1));
		}

	}

}
