
package com.cybage.fundamentals_2;

public class Assignment_8 {

	public static void main(String[] args) {
		
 Singleton singleton_1 =	Singleton.getInstance();
 Singleton singleton_2 =	Singleton.getInstance();
 System.out.println(singleton_1.hashCode());
 System.out.println(singleton_2.hashCode());
 
 
	}

}
