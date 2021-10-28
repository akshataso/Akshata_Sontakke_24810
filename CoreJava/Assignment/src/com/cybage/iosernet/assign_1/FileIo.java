
package com.cybage.iosernet.assign_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIo {

	public static void main(String[] args) {

		try (FileReader fileReader = new FileReader(
				new File("C:\\Users\\akhild\\Documents\\CORE_JAVA\\Assignment\\src\\com\\cybage\\iosernet\\assign_1\\test.txt"));
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				FileWriter fileWriter = new FileWriter(
						new File("C:\\Users\\akhild\\Documents\\CORE_JAVA\\Assignment\\src\\com\\cybage\\iosernet\\assign_1\\testOut.txt"));
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				bufferedWriter.write(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
