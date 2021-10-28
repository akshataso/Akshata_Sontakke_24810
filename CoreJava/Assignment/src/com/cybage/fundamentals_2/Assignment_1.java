
package com.cybage.fundamentals_2;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Assignment_1 {

	public static void main(String[] args) {
		System.out.println("DateTime: "+LocalDateTime.now());
	
	int res = Calendar.getInstance().getActualMaximum(Calendar.DATE);
	System.out.println("Last date of month: "+res);
	}

}
