package GUI;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class srv extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane in_ScrollPane, out_ScrollPane;
	private JTextArea in_TextField, out_TextField;
	private JLabel status_Lbl;
	private JButton send_Btn,start_Btn,close_Btn;
	private String content = "";
	private ServerSocket srvSocket;
	private Socket socket;
	private BufferedReader in;
	private BufferedWriter out;
	private Thread thread;

	/**
	 * Create the frame.
	 */
	public srv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Server Chat");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.isMaximumSizeSet();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		this.status_Lbl = new JLabel("Disconnected");
		status_Lbl.setHorizontalAlignment(SwingConstants.CENTER);
		status_Lbl.setBounds(10, 11, 231, 20);
		status_Lbl.setBorder(BorderFactory.createLineBorder(Color.gray));
		contentPane.add(status_Lbl);
		
		this.in_ScrollPane = new JScrollPane();
		in_ScrollPane.setBounds(10, 37, 414, 126);
		contentPane.add(in_ScrollPane);
		
		this.in_TextField = new JTextArea();
		in_TextField.setEditable(false);
		in_TextField.setWrapStyleWord(true);
		in_TextField.setRows(8);
		in_TextField.setLineWrap(true);
		in_TextField.setColumns(8);
		in_ScrollPane.setViewportView(in_TextField);
		
		this.send_Btn = new JButton("Send");
		send_Btn.setBounds(341, 168, 83, 86);
		send_Btn.setActionCommand("send");
		send_Btn.addActionListener(this);
		contentPane.add(send_Btn);
		
		this.out_ScrollPane = new JScrollPane();
		out_ScrollPane.setBounds(10, 168, 321, 86);
		contentPane.add(out_ScrollPane);
		
		this.out_TextField = new JTextArea();
		out_TextField.setLineWrap(true);
		out_TextField.setWrapStyleWord(true);
		out_TextField.setRows(5);
		out_TextField.setColumns(8);
		out_ScrollPane.setViewportView(out_TextField);
		
		this.start_Btn = new JButton("Start");
		start_Btn.setBounds(251, 10, 80, 23);
		start_Btn.setActionCommand("start");
		start_Btn.addActionListener(this);
		contentPane.add(start_Btn);
		
		close_Btn = new JButton("Close");
		close_Btn.setBounds(341, 10, 83, 23);
		close_Btn.setActionCommand("close");
		close_Btn.addActionListener(this);
		contentPane.add(close_Btn);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("start")) {
			try {
				this.srvSocket = new ServerSocket(9999);
				this.socket = srvSocket.accept();
				if(socket.isConnected()) {
					status_Lbl.setText("Connected");
					status_Lbl.setBackground(Color.green);
					status_Lbl.setOpaque(true);
					start_Btn.setEnabled(false);
					in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					in_TextField.setText("Server begin chat: ");
				}
				
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Error", "Exit", JOptionPane.OK_OPTION);
				e1.getMessage();
			} 
		}
		
		if(e.getActionCommand().equals("send")) {
				try {
					out.write(out_TextField.getText());
					out.newLine();
					out.flush();
					content = content + out_TextField.getText()+"\n";
					in_TextField.setText(content);
					out_TextField.setText("");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		
		if(e.getActionCommand().equals("close")) {
			int choose = JOptionPane.showConfirmDialog(null, "Do you want exit", "Close", JOptionPane.YES_NO_OPTION);
			if(choose == JOptionPane.YES_OPTION) {
				try {
					thread.stop();
					socket.close();
					in.close();
					out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(socket.isClosed()) {
					this.setVisible(false);
				}
			}
		}
		getContent();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					srv frame = new srv();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void getContent() {
		this.thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						content = content + in.readLine() +"\n";
						in_TextField.setText("Client: " + content);	
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
	}
}
