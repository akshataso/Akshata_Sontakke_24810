
package com.cybage.iosernet.assign_3;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientEnd {

	private Socket socket;
	private DataInputStream input, in;
	private DataOutputStream out;

	@SuppressWarnings("deprecation")
	public ClientEnd(String ip, int port) {
		try {
			socket = new Socket(ip, port);
			System.out.println("Connection established");
			input = new DataInputStream(System.in);
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		String line = "";
		String li = "";
		while (!line.equals("Over and Out")) {
			try {
				line = input.readLine();
				out.writeUTF(line);
				li = in.readUTF();
				System.out.println(li);
				;
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		System.out.println("Closing connection: Radio silence");
		try {
			input.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientEnd client = new ClientEnd("127.0.0.1", 5000);
	}

}
