package nemo1560.maneger_Form.DemoJTable.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.AncestorListener;

import org.w3c.dom.events.MouseEvent;

import nemo1560.maneger_Form.DemoJTable.Model.Student;

public class tableFrame extends JFrame implements MouseListener {
	private JPanel search;
	private JScrollPane scrollpane;
	private JTable tbl;
	

	public tableFrame() {
		this.setTitle("Danh sach thong tin");
		this.setSize(600, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(scrollpane(),BorderLayout.CENTER);
	}
	
	public JScrollPane scrollpane() {
		this.scrollpane = new JScrollPane(tbl());
		this.scrollpane.setViewportView(tbl());
	    return scrollpane;
	}
	
	public JTable tbl() {
		this.tbl = new JTable();
		this.tbl.setModel(new tableModel());
		this.tbl.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		this.tbl.addMouseListener(this);
		return tbl;
	}


	public void mousePressed(java.awt.event.MouseEvent arg0) {
		System.out.println(tbl.getValueAt(tbl.getSelectedRow(), tbl.getSelectedColumn()));
		int option = JOptionPane.showConfirmDialog(getContentPane(),"Chac chua","Ok",JOptionPane.YES_NO_OPTION,JOptionPane.YES_NO_CANCEL_OPTION);
		if(option == 0){
			
			
		}
	}

	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
