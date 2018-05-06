import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class mainGUI extends JFrame implements ActionListener {
	
	private JPanel GUI,north_panel,center_panel,south_panel;
	private JLabel lb_ten;
	private JTextField txt_1,txt_2;
	private JButton btn_ok;
	
	public mainGUI() {
		// TODO Auto-generated constructor stub
		this.setSize(300,300);
		this.setLocation(400, 200);
		this.setTitle("Demo GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(GUI());
	}
	
	JPanel GUI() {
		this.GUI = new JPanel( new BorderLayout());
		this.north_panel = new JPanel();
		this.center_panel = new JPanel();
		this.south_panel = new JPanel();
		
		this.north_panel.add(lb_ten());
		
		this.center_panel.add(txt_1());
		this.center_panel.add(txt_2());
		this.center_panel.setAlignmentX(BOTTOM_ALIGNMENT);
		
		this.south_panel.add(btn_ok());
		
		this.GUI.add(north_panel,BorderLayout.NORTH);
		this.GUI.add(center_panel,BorderLayout.CENTER);
		this.GUI.add(south_panel,BorderLayout.SOUTH);
		return GUI;
	}
	JLabel lb_ten() {
		this.lb_ten = new JLabel("Hello");
		this.lb_ten.setFont(new Font("Arial", Font.BOLD, 30));
		return lb_ten;
	}
	JTextField txt_1() {
		this.txt_1 = new JTextField(20);
		this.txt_1.addActionListener(this);
		this.txt_1.setAlignmentX(BOTTOM_ALIGNMENT);
		return txt_1;
	}
	JTextField txt_2() {
		this.txt_2 = new JTextField(20);
		this.txt_2.addActionListener(this);
		this.txt_2.setAlignmentX(BOTTOM_ALIGNMENT);
		return txt_2;
	}
	JButton btn_ok() {
		this.btn_ok = new JButton("Submit");
		this.txt_2.setActionCommand("");
		this.btn_ok.addActionListener(this);
		return btn_ok;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="Submit") {
			if(txt_1.getText().equals("")||txt_2.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "Nhap thong tin");
			}
			else {
				entity en = new entity(Integer.parseInt(txt_1.getText()), Integer.parseInt(txt_2.getText()));
				JOptionPane.showMessageDialog(rootPane, "Done");
				action action = new action();
				action.Display(en.getNumber1(), en.getNumber2());
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainGUI().setVisible(true);
	}

}
