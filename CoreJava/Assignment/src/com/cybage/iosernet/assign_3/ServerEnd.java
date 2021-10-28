
package com.cybage.iosernet.assign_3;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEnd {

	private Socket socket;
	private ServerSocket server;
	private DataInputStream in;

	public ServerEnd(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("Server initiated");
			System.out.println("Waiting....");
			socket = server.accept();
			System.out.println("Access Granted");
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			DataInputStream input = new DataInputStream(System.in);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			String line = "";
			String li = "";
			while (!line.equals("Over and Out")) {
				try {
					line = in.readUTF();
					System.out.println(line);
					li = input.readLine();
					out.writeUTF(li);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("Terminating connection");
			socket.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		ServerEnd server = new ServerEnd(5000);

	}

}
