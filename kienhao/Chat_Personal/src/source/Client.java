package source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	private Socket socket;
	private BufferedReader in;
	private BufferedWriter out;
	private String input, output, ip;
	private Scanner scan;
	
	public Client() throws UnknownHostException, IOException {
		System.out.println("Nhap vao IP may Server: ");
		this.scan = new Scanner(System.in);
		ip = scan.next();
		this.socket = new Socket(ip, 9999);
		this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		/*vong lap de nhan thong tin va gui thong tin giua client va server
		 * 
		 *  chu y: client phai gui thong tin truoc khi nhan.
		 *  
		 *  */
		while(true) {
			//System.out.println("Client nhap noi dung: ");
			output = scan.nextLine();
			out.write(output);
			out.newLine();
			out.flush();
			
			input = in.readLine();
			
			if(input.length() > 0) {
				System.out.println("Server: "+ input + "\n");
				if(input.substring(0, input.length()).equals("out")) {
					out.close();
					in.close();
					socket.close();
					break;
				}
			}
		}
		System.out.println("Closed");
		out.close();
		in.close();
		socket.close();	
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Client();
	}

}
