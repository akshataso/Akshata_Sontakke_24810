
package com.cybage.abstractInterface.assign_3;

public class Utility {
public void printAll(Printable[] printables) {
	for(Printable pr:printables) {
		if(pr!=null) {
			pr.print();
		}
	}
}
}
