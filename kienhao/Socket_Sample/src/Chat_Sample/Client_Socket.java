package Chat_Sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_Socket {
	private String Host = "127.0.0.1";
	private Socket SocketCilent;
	private BufferedReader in;
	private BufferedWriter out;
	private Scanner input;
	
	public Client_Socket() {
		/*Gui yeu cau ket noi toi server*/
		try {
			this.SocketCilent = new Socket(Host,9999);
			this.in = new BufferedReader(new InputStreamReader(SocketCilent.getInputStream()));
			this.out = new BufferedWriter(new OutputStreamWriter(SocketCilent.getOutputStream()));
			
			String temp = "";
			this.input = new Scanner(System.in);
			System.out.println("Moi go vao:");
			do {
				temp = input.nextLine();
				this.out.write(temp);
				this.out.newLine();
				this.out.flush();
				

				String ServerResponse;
				if((ServerResponse = this.in.readLine()).length()>0) {
					System.out.println(ServerResponse);
					if(ServerResponse.substring(0).equals(">>quit")) {
						this.SocketCilent.close();
						this.out.close();
						this.in.close();
					}
				}
			}
			while(temp.length()<30);
				System.out.println("Closed");
				this.out.close();
				this.in.close();
				this.SocketCilent.close();
		
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		new Client_Socket();
	}

}
