package app_Chat.GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Input_IP extends JFrame implements ActionListener {
	private JPanel root_Panel;
	private JTextField ip_Txt;
	private JButton in_Btn;
	private static String ip;
	
	public String getIp() {
		return ip;
	}

	public JPanel getRoot_Panel() {
		this.root_Panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		this.root_Panel.setBorder(new TitledBorder("IP server"));
		this.root_Panel.add(getIp_Txt());
		this.root_Panel.add(getIn_Btn());
		return root_Panel;
	}

	public JTextField getIp_Txt() {
		this.ip_Txt = new JTextField(20);
		this.ip_Txt.setPreferredSize(new Dimension(100, 30));
		return ip_Txt;
	}

	public JButton getIn_Btn() {
		this.in_Btn = new JButton("Set");
		this.in_Btn.setActionCommand("set");
		this.in_Btn.addActionListener(this);
		this.in_Btn.setPreferredSize(new Dimension(60, 40));
		return in_Btn;
	}

	public Input_IP() {
		this.setTitle("Server IP");
		this.setSize(300, 120);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(getRoot_Panel());
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("set")) {
			if(!ip_Txt.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "OK", "Connect", 1);
				ip = ip_Txt.getText();
				System.out.println(ip);
				this.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "Input Server IP, Please", "Null", 0);
			}
			
		}
		
	}

	
}
