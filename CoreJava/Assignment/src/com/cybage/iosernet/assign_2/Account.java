
package com.cybage.iosernet.assign_2;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Account implements Serializable{
private LocalDateTime dateOfCreation;


public Account(LocalDateTime dateOfCreation) {
	
	this.dateOfCreation = dateOfCreation;
}

public LocalDateTime getDateOfCreation() {
	return dateOfCreation;
}

public void setDateOfCreation(LocalDateTime dateOfCreation) {
	this.dateOfCreation = dateOfCreation;
}

@Override
public String toString() {
	return "Account [dateOfCreation=" + dateOfCreation + "]";
}


}
