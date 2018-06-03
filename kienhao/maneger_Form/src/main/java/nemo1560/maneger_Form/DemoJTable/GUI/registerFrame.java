package nemo1560.maneger_Form.DemoJTable.GUI;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import nemo1560.maneger_Form.DemoJTable.Controller.Controller;
import nemo1560.maneger_Form.DemoJTable.Model.Change;
import nemo1560.maneger_Form.DemoJTable.Model.Student_static;

public class registerFrame extends JFrame implements ActionListener {
	private JPanel Register,forms,btn,Update,forms_Update,btn2;
	private JLabel StdID,StdName,StdClass,StdAddress,StdIDNumber;
	private JTextField txt_StdID,txt_StdName,txt_StdClass,txt_StdAddress,txt_StdIDNumber;
	private JButton btn_back,btn_submit,btn_search,btn_update;
	private int change = new Change().getRequest();

	public JTextField getTxt_StdID() {
		this.txt_StdID = new JTextField(30);
		/*set value in textfield on update form*/
		if(change>0) {
			this.txt_StdID.setText(String.valueOf(Student_static.getStdID()));
			this.txt_StdID.setEditable(false);
		}
		return txt_StdID;
	}

	public JTextField getTxt_StdName() {
		this.txt_StdName = new JTextField(30);
		/*set value in textfield on update form*/
		if(change>0) {
			this.txt_StdName.setText(Student_static.getStdName());
		}
		return txt_StdName;
	}

	public JTextField getTxt_StdClass() {
		this.txt_StdClass = new JTextField(30);
		/*set value in textfield on update form*/
		if(change>0) {
			this.txt_StdClass.setText(Student_static.getStdClass());
		}
		return txt_StdClass;
	}

	public JTextField getTxt_StdAddress() {
		this.txt_StdAddress = new JTextField(30);
		/*set value in textfield on update form*/
		if(change>0) {
			this.txt_StdAddress.setText(Student_static.getStdAddress());
		}
		return txt_StdAddress;
	}

	public JTextField getTxt_StdIDNumber() {
		this.txt_StdIDNumber = new JTextField(30);
		/*set value in textfield on update form*/
		if(change>0) {
			this.txt_StdIDNumber.setText(String.valueOf(Student_static.getStdIDNumber()));
		}
		return txt_StdIDNumber;
	}

	public JLabel getStdID() {
		this.StdID = new JLabel("Ma sinh vien");
		return StdID;
	}
	
	public JLabel getStdName() {
		this.StdName = new JLabel("Ho va ten: ");
		return StdName;
	}

	public JLabel getStdClass() {
		this.StdClass = new JLabel("Lop: ");
		return StdClass;
	}

	public JLabel getStdAddress() {
		this.StdAddress = new JLabel("Dia chi: ");
		return StdAddress;
	}

	public JLabel getStdIDNumber() {
		this.StdIDNumber = new JLabel("So CMND: ");
		return StdIDNumber;
	}

	public JButton getBtn_back() {
		this.btn_back = new JButton("Tro ve");
		this.btn_back.setToolTipText("Tro ve");
		this.btn_back.addActionListener(this);
		this.btn_back.setActionCommand("btn_back");
		return btn_back;
	}

	public JButton getBtn_submit() {
		this.btn_submit = new JButton("Dang ky");
		this.btn_submit.setToolTipText("Ghi nhan thong tin");
		this.btn_submit.addActionListener(this);
		this.btn_submit.setActionCommand("btn_submit");
		return btn_submit;
	}
	
	public JButton getBtn_search() {
		this.btn_search = new JButton("Tim kiem");
		this.btn_search.setToolTipText("Tim kiem thong tin");
		this.btn_search.addActionListener(this);
		this.btn_search.setActionCommand("btn_search");
		return btn_search;
	}
	
	public JButton getBtn_update() {
		this.btn_update = new JButton("Cap nhat");
		this.btn_update.setToolTipText("Cap nhat thong tin");
		this.btn_update.addActionListener(this);
		this.btn_update.setActionCommand("btn_update");
		return btn_update;
	}
	
	public registerFrame() {
		this.setSize(300, 320);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*set int request for show frames*/
		if(change == 0){
			this.setTitle("Dang ky thong tin");
			this.add(Register(),BorderLayout.CENTER);
		}
		else {
			this.setTitle("Thay doi thong tin");
			this.add(Update(),BorderLayout.CENTER);
		}
	}
	
	//create Register form.
	public JPanel Register() {
		/*panel root*/
		this.Register = new JPanel(new FlowLayout(FlowLayout.CENTER));
		/*panel add labels and field text */
		this.forms = new JPanel(new GridLayout(10, 1));
		/*panel add 2 buttons*/
		this.btn = new JPanel(new BorderLayout());
		/*set margin, title panel*/
		this.forms.setBorder(new TitledBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10),"BANG THONG TIN"));
		
		/*add components*/
		this.forms.add(getStdID());
		this.forms.add(getTxt_StdID());
		this.forms.add(getStdName());
		this.forms.add(getTxt_StdName());
		this.forms.add(getStdClass());
		this.forms.add(getTxt_StdClass());
		this.forms.add(getStdAddress());
		this.forms.add(getTxt_StdAddress());
		this.forms.add(getStdIDNumber());
		this.forms.add(getTxt_StdIDNumber());
		this.btn.add(getBtn_back(),BorderLayout.WEST);
		this.btn.add(getBtn_submit(),BorderLayout.CENTER);
		this.btn.add(getBtn_search(),BorderLayout.EAST);
		
		/*add child panels in root panel*/
		this.Register.add(forms);
		this.Register.add(btn);
		return Register;
	}
	
	//Create UpdateData form
	public JPanel Update() {
		/*set root update panel*/
		this.Update = new JPanel(new FlowLayout(FlowLayout.CENTER));
		/*set update_forms panel*/
		this.forms_Update = new JPanel(new GridLayout(10, 1));
		/*set btn_form panel */
		this.btn2 = new JPanel(new BorderLayout());
		
		/*add components*/
		this.forms_Update.add(getStdID());
		this.forms_Update.add(getTxt_StdID());
		this.forms_Update.add(getStdName());
		this.forms_Update.add(getTxt_StdName());
		this.forms_Update.add(getStdClass());
		this.forms_Update.add(getTxt_StdClass());
		this.forms_Update.add(getStdAddress());
		this.forms_Update.add(getTxt_StdAddress());
		this.forms_Update.add(getStdIDNumber());
		this.forms_Update.add(getTxt_StdIDNumber());
		this.btn2.add(getBtn_update(),BorderLayout.CENTER);
		
		/*add child panels in root panel*/
		this.Update.add(forms_Update);
		this.Update.add(btn2);
		return Update;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("btn_back")) {
			this.setVisible(false);
		}
		
		if(e.getActionCommand().equals("btn_submit")) {
			if(txt_StdName.getText().isEmpty()||txt_StdClass.getText().isEmpty()
			||txt_StdAddress.getText().isEmpty()||txt_StdIDNumber.getText().isEmpty()) {
				btn_submit.setEnabled(false);
				JOptionPane.showMessageDialog(null,"Vui long nhap thong tin");
				try {
					//check textfield null set disable btn in 5s.
					TimeUnit.MILLISECONDS.sleep(200);
					btn_submit.setEnabled(true);
				} catch (InterruptedException btn) {
					btn.getMessage();
				}
			}
			else {
				txt_StdID.setEditable(false);
				boolean done = new Controller().insertDB(txt_StdName.getText(), txt_StdClass.getText(), txt_StdAddress.getText(),Integer.parseInt(txt_StdIDNumber.getText()));
				JOptionPane.showMessageDialog(null, "Da ghi nhan");
				if(done) {
					txt_StdID.setEditable(true);
					txt_StdName.setText("");
					txt_StdClass.setText("");
					txt_StdAddress.setText("");
					txt_StdIDNumber.setText("");
				}
			}
		}
		
		if(e.getActionCommand().equals("btn_search")) {
			new Controller().getAllValue(txt_StdName.getText(), txt_StdID.getText(), txt_StdClass.getText(), txt_StdAddress.getText(), txt_StdIDNumber.getText());
			JOptionPane.showMessageDialog(null, "Tim duoc");
			new tableFrame().setVisible(true);
		}
		
		if(e.getActionCommand().equals("btn_update")) {
			boolean done = new Controller().updateValue(String.valueOf(Student_static.getStdID()),Student_static.getStdName(), Student_static.getStdClass(), Student_static.getStdAddress(), String.valueOf(Student_static.getStdIDNumber()));
			if(done) {
				JOptionPane.showMessageDialog(null, "Da thay doi");
			}
		}
	}
}
