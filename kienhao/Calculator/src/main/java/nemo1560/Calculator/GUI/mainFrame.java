package nemo1560.Calculator.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nemo1560.Calculator.Process.Process;

public class mainFrame extends JFrame implements ActionListener{
	private JPanel main_frm,LCD_frm,btn_frm,operation_frm;
	private JTextField LCD;
	private JButton add_btn, sub_btn, multi_btn, div_btn, equals_btn, dot_btn, zero_btn, num_btn, del_btn, reset_btn ;
	private String numberA, numberB, input, operator = " ";
	private Process process;
	
/* tao frame may tinh  */
	public mainFrame() {
		this.setTitle("May tinh cua toi");
		this.setSize(280, 310);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(main_frm());
		
	}
	/*tao panel root*/
	public JPanel main_frm() {
		this.main_frm = new JPanel();
		this.main_frm.add(LCD_frm(),BorderLayout.NORTH);
		this.main_frm.add(btn_frm(),BorderLayout.CENTER);
		this.main_frm.add(operation_frm(),BorderLayout.EAST);
		return main_frm;
	}
	/*tao panel LCD*/
	public JPanel LCD_frm() {
		this.LCD_frm = new JPanel(new FlowLayout(FlowLayout.LEADING));
		this.LCD_frm.add(getLCD());
		return LCD_frm;
	}
	/*tao panel numbers*/
	public JPanel btn_frm() {
		this.btn_frm = new JPanel(new GridLayout(4,3));
		for(int i=1;i<10;i++) {
			this.btn_frm.add(getNum_btn(i));
		}
		this.btn_frm.add(getZero_btn());
		this.btn_frm.add(getDot_btn());
		this.btn_frm.add(getEquals_btn());
		return btn_frm;
	}
	/*tao panel operation*/
	public JPanel operation_frm() {
		this.operation_frm = new JPanel(new GridLayout(4, 2));
		this.operation_frm.add(getAdd_btn());
		this.operation_frm.add(getSub_btn());
		this.operation_frm.add(getMulti_btn());
		this.operation_frm.add(getDiv_btn());
		this.operation_frm.add(getDel_btn());
		this.operation_frm.add(getReset_btn());
		return operation_frm;
	}
	
	public JTextField getLCD() {
		this.LCD = new JTextField(25);
		this.LCD.setBackground(Color.gray);
		this.LCD.setPreferredSize(new Dimension(250, 40));
		this.LCD.setForeground(Color.WHITE);
		return LCD;
	}
	
	public JButton getAdd_btn() {
		this.add_btn = new JButton("+");
		this.add_btn.setActionCommand("+");
		this.add_btn.addActionListener(this);
		this.add_btn.setPreferredSize(num_btn.getPreferredSize());
		this.add_btn.setFont(new Font(null, Font.BOLD, 15));
		return add_btn;
	}
	
	public JButton getSub_btn() {
		this.sub_btn = new JButton("-");
		this.sub_btn.setActionCommand("-");
		this.sub_btn.addActionListener(this);
		this.sub_btn.setPreferredSize(num_btn.getPreferredSize());
		this.sub_btn.setFont(new Font(null, Font.BOLD, 15));
		return sub_btn;
	}
	
	public JButton getMulti_btn() {
		this.multi_btn = new JButton("*");
		this.multi_btn.setActionCommand("*");
		this.multi_btn.addActionListener(this);
		this.multi_btn.setPreferredSize(num_btn.getPreferredSize());
		this.multi_btn.setFont(new Font(null, Font.BOLD, 15));
		return multi_btn;
	}
	
	public JButton getDiv_btn() {
		this.div_btn = new JButton("/");
		this.div_btn.setActionCommand("/");
		this.div_btn.addActionListener(this);
		this.div_btn.setPreferredSize(num_btn.getPreferredSize());
		this.div_btn.setFont(new Font(null, Font.BOLD, 15));
		return div_btn;
	}
	
	public JButton getEquals_btn() {
		this.equals_btn = new JButton("=");
		this.equals_btn.setActionCommand("=");
		this.equals_btn.addActionListener(this);
		this.equals_btn.setPreferredSize(num_btn.getPreferredSize());
		this.equals_btn.setFont(new Font(null, Font.BOLD, 15));
		return equals_btn;
	}
	
	public JButton getDot_btn() {
		this.dot_btn = new JButton(".");
		this.dot_btn.setActionCommand(".");
		this.dot_btn.addActionListener(this);
		this.dot_btn.setPreferredSize(num_btn.getPreferredSize());
		this.dot_btn.setFont(new Font(null, Font.BOLD, 15));
		return dot_btn;
	}
	
	public JButton getNum_btn(int i) {
		this.num_btn = new JButton(String.valueOf(i));
		this.num_btn.setActionCommand(String.valueOf(i));
		this.num_btn.setPreferredSize(new  Dimension(50, 50));
		this.num_btn.setFont(new Font(null, Font.BOLD, 15));
		this.num_btn.addActionListener(this);
		return num_btn;
	}
	
	public JButton getZero_btn() {
		this.zero_btn = new JButton("0");
		this.zero_btn.setActionCommand("0");
		this.zero_btn.addActionListener(this);
		this.zero_btn.setPreferredSize(num_btn.getPreferredSize());
		this.zero_btn.setFont(new Font(null, Font.BOLD, 15));
		return zero_btn;
	}
	
	public JButton getDel_btn() {
		this.del_btn = new JButton("<");
		this.del_btn.setActionCommand("del");
		this.del_btn.addActionListener(this);
		this.del_btn.setPreferredSize(num_btn.getPreferredSize());
		this.del_btn.setFont(new Font(null, Font.BOLD, 15));
		return del_btn;
	}
	
	public JButton getReset_btn() {
		this.reset_btn = new JButton("E");
		this.reset_btn.setActionCommand("reset");
		this.reset_btn.addActionListener(this);
		this.reset_btn.setPreferredSize(num_btn.getPreferredSize());
		this.reset_btn.setFont(new Font(null, Font.BOLD, 15));
		return reset_btn;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("0")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		
		if(e.getActionCommand().equals("1")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("2")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("3")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("4")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("5")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("6")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("7")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("8")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		if(e.getActionCommand().equals("9")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		
		if(e.getActionCommand().equals(".")) {
			this.LCD.setText(this.LCD.getText().concat(e.getActionCommand()));
		}
		
		if(e.getActionCommand().equals("del")) {
			this.numberA = this.LCD.getText();
			this.LCD.setText(this.numberA.substring(0, this.numberA.length()-1));
			if(this.LCD.getText().isEmpty()) {
				this.LCD.setText("0");
			}
		}
		
		if(e.getActionCommand().equals("reset")) {
			this.LCD.setText("");
			if(this.LCD.getText().isEmpty()) {
				this.LCD.setText("0");
			}
		}
		
		if(e.getActionCommand().equals("+")) {
			//lay data la dau + khi nhap vao.
			this.operator = e.getActionCommand();
			//in ra textfield tiep tuc sau dau +;
			this.LCD.setText(this.LCD.getText().concat(this.operator));
		}
		if(e.getActionCommand().equals("-")) {
			//lay data la dau - khi nhap vao.
			this.operator = e.getActionCommand();
			//in ra textfield tiep tuc sau dau -;
			this.LCD.setText(this.LCD.getText().concat(this.operator));
		}
		if(e.getActionCommand().equals("*")) {
			//lay data la dau * khi nhap vao.
			this.operator = e.getActionCommand();
			//in ra textfield tiep tuc sau dau *;
			this.LCD.setText(this.LCD.getText().concat(this.operator));
		}
		if(e.getActionCommand().equals("/")) {
			//lay data la dau / khi nhap vao.
			this.operator = e.getActionCommand();
			//in ra textfield tiep tuc sau dau /;
			this.LCD.setText(this.LCD.getText().concat(this.operator));
		}
		
		if(e.getActionCommand().equals("=")) {
			this.process = new Process();
			this.input = this.LCD.getText();
			//lay so nhap vao truoc dau 
			if(this.operator.equals(" ")) {
				this.numberA = this.LCD.getText().substring(0,input.length());
			}
			else {
				System.out.println(this.operator);
				this.numberA = this.LCD.getText().substring(0,input.indexOf(this.operator));
			}
			this.numberB = this.LCD.getText().substring(this.input.indexOf(this.operator)+1, this.input.length());
			if(numberA.isEmpty()) {
				numberA = "0";
			}
			if(numberB.isEmpty()) {
				numberB = "0";
			}
			switch (this.operator) {
			case "+":
				this.process.Add(Double.valueOf(numberA), Double.valueOf(numberB));
				this.LCD.setText(String.valueOf(this.process.getResult()));
				break;
			case "-":
				this.process.Sub(Double.valueOf(numberA), Double.valueOf(numberB));
				this.LCD.setText(String.valueOf(this.process.getResult()));
				break;
			case "*":
				this.process.Mul(Double.valueOf(numberA), Double.valueOf(numberB));
				this.LCD.setText(String.valueOf(this.process.getResult()));
				break;
			case "/":
				this.process.Div(Double.valueOf(numberA), Double.valueOf(numberB));
				this.LCD.setText(String.valueOf(this.process.getResult()));
				break;
			default:
				this.LCD.setText(numberA);
				break;
			}
		}
	}
}
