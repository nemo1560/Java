package app_Chat.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

public class Client_GUI extends JFrame implements ActionListener, KeyListener {
	private JPanel root_Panel, in_Panel, btn_Panel, status_Panel;
	private JTextArea out_Txt,in_Txt;
	private JButton send_Btn, ip_Btn, start_Btn;
	private JLabel status_Lbl;
	private JScrollPane scroll_Out;
	private String str_Chat="";
	private Socket socket;
	private BufferedReader in;
	private BufferedWriter out;

	public JLabel getStatus_Lbl() {
		this.status_Lbl = new JLabel("Connected");
		this.status_Lbl.setSize(new Dimension(300, 20));
		return status_Lbl;
	}

	public JPanel getStatus_Panel () {
		this.status_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//this.status_Panel.setPreferredSize(new Dimension(this.getWidth()-10, 25));
		this.status_Panel.setOpaque(true);
		this.status_Panel.setBackground(Color.GREEN);
		this.status_Panel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		this.status_Panel.add(getStatus_Lbl());
		return status_Panel;
	}

	public JTextArea getOut_Txt() {
		this.out_Txt = new JTextArea();
		this.out_Txt.setLineWrap(true);
		this.out_Txt.setEditable(false);
		return out_Txt;
	}
	
	public JScrollPane getScroll_Out() {
		this.scroll_Out = new JScrollPane(getOut_Txt());
		this.scroll_Out.setViewportView(getOut_Txt());
		this.scroll_Out.setAutoscrolls(true);
		this.scroll_Out.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		return scroll_Out;
	}
	
	public JButton getIp_Btn() {
		this.ip_Btn = new JButton("IP Server");
		this.ip_Btn.setPreferredSize(new Dimension(140, 20));
		this.ip_Btn.setActionCommand("ip");
		this.ip_Btn.addActionListener(this);
		return ip_Btn;
	}

	public JButton getSend_Btn() {
		this.send_Btn = new JButton("Send");
		this.send_Btn.setPreferredSize(new Dimension(140, 20));
		this.send_Btn.setActionCommand("send");
		this.send_Btn.addActionListener(this);
		return send_Btn;
	}
	public JButton getStart_Btn() {
		this.start_Btn = new JButton("Start");
		this.start_Btn.setPreferredSize(new Dimension(140, 20));
		this.start_Btn.setActionCommand("start");
		this.start_Btn.addActionListener(this);
		return start_Btn;
	}
	
	public JTextArea getIn_Txt() {
		this.in_Txt = new JTextArea();
		this.in_Txt.setLineWrap(true);
		this.in_Txt.addKeyListener(this);
		this.in_Txt.setPreferredSize(new Dimension(320, 80));
		this.in_Txt.setBorder(BorderFactory.createLineBorder(Color.gray));
		return in_Txt;
	}
	
	public JPanel getBtn_Panel() {
		this.btn_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		this.btn_Panel.add(getSend_Btn());
		this.btn_Panel.add(getIp_Btn());
		this.btn_Panel.add(getStart_Btn());
		return btn_Panel;
	}
	
	public JPanel getIn_Panel() {
		this.in_Panel = new JPanel(new GridLayout(1, 2));
		this.in_Panel.setPreferredSize(new Dimension(this.getWidth(), 100));
		this.in_Panel.add(getIn_Txt());
		this.in_Panel.add(getBtn_Panel());
		return in_Panel;
	}

	public JPanel getRoot_Panel() {
		this.root_Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		this.root_Panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50) );
		this.root_Panel.setBorder(new TitledBorder("Chat screen"));
		this.root_Panel.add(getIn_Panel());
		return root_Panel;
	}

	public Client_GUI() {
		this.setTitle("Private Chat");
		this.setSize(400, 320);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(getStatus_Panel(),BorderLayout.NORTH);
		this.add(getScroll_Out(),BorderLayout.CENTER);
		this.add(getRoot_Panel(),BorderLayout.SOUTH);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ip")) {
			new Input_IP().setVisible(true);
			if(new Input_IP().getIp() != null) {
				System.out.println(new Input_IP().getIp());
				
			}
			
		}
		
		if(e.getActionCommand().equals("start")) {
			socket_Action();
		}
		
		if(e.getActionCommand().equals("send")) {
			this.str_Chat+=in_Txt.getText() + "\n";
			out_Txt.setText(str_Chat);
			in_Txt.setText("");
			try {
				
				out.write(str_Chat);
				out.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	public void socket_Action() {
		try {
			this.socket = new Socket("127.0.0.1", 9999);
			this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				str_Chat = in.readLine() + "\n";
				in_Txt.setText(str_Chat);
				
				if(str_Chat.substring(0, str_Chat.length()).equals("quit")) {
					in.close();
					System.out.println("close");
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new Client_GUI().setVisible(true);
				
			}
		});
	}

}
