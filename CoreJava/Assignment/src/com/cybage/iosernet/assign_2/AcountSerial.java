
package com.cybage.iosernet.assign_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class AcountSerial {

	public static void main(String[] args) {
	Account account = new Account(LocalDateTime.now());
	try (FileOutputStream fileOutputStream= new FileOutputStream(new File("C:\\Users\\akhild\\Documents\\CORE_JAVA\\Assignment\\src\\com\\cybage\\iosernet\\assign_2\\test.txt"));
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\akhild\\Documents\\CORE_JAVA\\Assignment\\src\\com\\cybage\\iosernet\\assign_2\\test.txt"));
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			){
		objectOutputStream.writeObject(account);
		System.out.println("Object Serialized");
		
		Account account2 = (Account)objectInputStream.readObject();
		System.out.println("Deserialized: "+account2);
	}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

	}

}
