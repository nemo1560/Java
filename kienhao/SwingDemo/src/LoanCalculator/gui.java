package LoanCalculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class gui extends JFrame implements ActionListener{	
	
	private JPanel btn_main,in_main;
	private JButton btnCal,btnReset;
	private JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
	private JTextField txt1,txt2,txt3,txt4,txt5;
	
	public gui() {
		this.setTitle("Loan Calculator");
		//this.setSize(0, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(in_main(),BorderLayout.NORTH);
		this.add(btn_main(),BorderLayout.SOUTH);
		this.pack(); // lay chieu cao cua tat ca component + lai.
	}
	
	public JPanel in_main() {
		this.in_main = new JPanel(new GridLayout(5, 2));
		this.in_main.setBorder(new TitledBorder("Khung tinh lai tien vay theo lai xuat nam"));
		this.in_main.add(lbl1());
		this.in_main.add(txt1());
		this.in_main.add(lbl2());
		this.in_main.add(txt2());
		this.in_main.add(lbl3());
		this.in_main.add(txt3());
		this.in_main.add(lbl4());
		this.in_main.add(txt4());
		this.in_main.add(lbl5());
		this.in_main.add(txt5());
		
		return in_main;
	}
	public JPanel btn_main() {
		this.btn_main = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		this.btn_main.add(btnReset());
		this.btn_main.add(btnCal());
		return btn_main;
	}
	
	
	public JLabel lbl1() {
		this.lbl1 = new  JLabel("Lai suat theo nam: ");
		return lbl1;
	}
	public JLabel lbl2() {
		this.lbl2 = new  JLabel("So nam tinh lai: ");
		return lbl2;
	}
	public JLabel lbl3() {
		this.lbl3 = new  JLabel("So no vay: ");
		return lbl3;
	}
	public JLabel lbl4() {
		this.lbl4 = new  JLabel("Lai tra hang thang: ");
		return lbl4;
	}
	public JLabel lbl5() {
		this.lbl5 = new  JLabel("tong lai phai tra: ");
		return lbl5;
	}
	public JTextField txt1() {
		this.txt1 = new JTextField();
		return txt1;
	}
	public JTextField txt2() {
		this.txt2 = new JTextField();
		return txt2;
	}
	public JTextField txt3() {
		this.txt3 = new JTextField();
		return txt3;
	}
	public JTextField txt4() {
		this.txt4 = new JTextField();
		return txt4;
	}
	public JTextField txt5() {
		this.txt5 = new JTextField();
		return txt5;
	}
	public JButton btnReset() {
		this.btnReset = new JButton("Reset");
		this.btnReset.addActionListener(this);
		this.btnReset.setActionCommand("reset");
		return btnReset;
	}
	public JButton btnCal() {
		this.btnCal = new JButton("Calculator");
		this.btnCal.addActionListener(this);
		this.btnCal.setActionCommand("cal");
		return btnCal;
	}

	
	public static void main(String[] agrs) {	
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new gui().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "cal") {
			if(txt1.getText().isEmpty()||txt2.getText().isEmpty()||txt3.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Input vlaues, please");
			}else {
				Loan loan = new Loan();
				loan.setIntrate(Double.parseDouble(txt1.getText()));
				loan.setNumberOfYear(Integer.parseInt(txt2.getText()));
				loan.setBalance(Double.parseDouble(txt3.getText()));
				
				txt4.setText(String.format("%.2f", loan.getIntrate()));
				txt5.setText(String.format("%.2f", loan.getTotalInterest()));
			}
			
		}
		if(e.getActionCommand()=="reset") {
			txt1.setText(null);
			txt2.setText(null);
			txt3.setText(null);
			txt4.setText(null);
			txt5.setText(null);
		}
	}
	
}


