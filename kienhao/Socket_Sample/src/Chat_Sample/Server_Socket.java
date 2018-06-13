package Chat_Sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket {
	
	private ServerSocket Server;
	private String str;
	private BufferedReader in;
	private BufferedWriter out;
	private Socket SocketSRV;

	public Server_Socket() {
		try {
			this.Server = new ServerSocket(9999);
			System.out.println("Waitng");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		try {
			this.SocketSRV = this.Server.accept();
			System.out.println("Accepted");
			
			this.in = new BufferedReader(new InputStreamReader(SocketSRV.getInputStream()));
			this.out = new BufferedWriter(new OutputStreamWriter(SocketSRV.getOutputStream()));
			
			while(1>0) {
				this.str = in.readLine();
				
				this.out.write(">>"+ this.str);
				this.out.newLine();
				this.out.flush();
				
				if(this.str.equals("quit")) {
					this.out.write(">>");
					this.out.newLine();
					this.out.flush();
					this.in.close();
					this.Server.close();
					this.out.close();
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		new Server_Socket();
	}
	
}
