package source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket srvSocket;
	private Socket socket;
	private BufferedReader in;
	private BufferedWriter out;
	private String output, input;
	private Scanner scan;
	
	public Server() throws IOException {
		this.srvSocket = new ServerSocket(9999);
		System.out.println("Cho Client ket noi");
		
		this.socket = srvSocket.accept();
		System.out.println("\n"+ "Da ket noi");
		
		this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		/*vong lap de nhan thong tin va gui thong tin giua client va server
		 * 
		 *  chu y: server se nhan thong tin truoc.
		 *  
		 *  */
		while(true) {
			
			input = in.readLine();
			
			if(input.length() > 0) {
				System.out.println("Client: "+ input + "\n");
				if(input.substring(0, input.length()).equals("out")) {
					out.close();
					in.close();
					socket.close();
					break;
				}
			}
			//System.out.println("Server nhap noi dung: ");
			this.scan = new Scanner(System.in);
			output = scan.nextLine();
			out.write(output);
			out.newLine();
			out.flush();	
		}
		System.out.println("Closed");
		out.close();
		in.close();
		socket.close();
		
	}
	
	public static void main(String[] agrs) throws IOException {
		new Server();
	}

}
