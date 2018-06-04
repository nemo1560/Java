package nemo1560.maneger_Form.DemoJTable.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import nemo1560.maneger_Form.DemoJTable.Controller.Controller;
import nemo1560.maneger_Form.DemoJTable.Model.Change;
import nemo1560.maneger_Form.DemoJTable.Model.Student_static;

public class tableFrame extends JFrame implements MouseListener, ActionListener {
	private JScrollPane scrollpane;
	private JTable tbl;
	private JPopupMenu popupmenu;
	private JMenuItem update,delete;

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
		this.tbl.setComponentPopupMenu(popupmenu());
		return tbl;
	}
	
	public JPopupMenu popupmenu() {
		this.popupmenu = new JPopupMenu();
		this.popupmenu.add(getUpdate());
		this.popupmenu.add(getDelete());
		return popupmenu;
	}


	public JMenuItem getUpdate() {
		this.update = new JMenuItem("Cap nhat thong tin");
		this.update.addActionListener(this);
		this.update.setActionCommand("update");
		return update;
	}

	public JMenuItem getDelete() {
		this.delete = new JMenuItem("Xoa thong tin");
		this.delete.setActionCommand("delete");
		this.delete.addActionListener(this);
		return delete;
	}
	
	//Action when right click in Table
	public void mousePressed(java.awt.event.MouseEvent e) {
		popupmenu();
	}

	//Action of PopupMenu
	public void actionPerformed(ActionEvent e2) {
		
		/*set action for click update*/
		if(e2.getActionCommand().equals("update")) {
			Student_static.setStdID(Integer.parseInt(new tableModel().getValueAt(tbl.getSelectedRow(), 0).toString()));
			Student_static.setStdName(new tableModel().getValueAt(tbl.getSelectedRow(), 1).toString());
			Student_static.setStdClass(new tableModel().getValueAt(tbl.getSelectedRow(), 2).toString());
			Student_static.setStdAddress(new tableModel().getValueAt(tbl.getSelectedRow(), 3).toString());
			Student_static.setStdIDNumber(Integer.parseInt(new tableModel().getValueAt(tbl.getSelectedRow(), 4).toString()));
			new Change().setRequest(1);
			this.setVisible(false);
			new registerFrame().setVisible(true);
		}
		/*set action for click delete*/
		if(e2.getActionCommand().equals("delete")) {
			int row = tbl.getSelectedRow();
			row++;
			try {
				new Controller().deleteValue(row);
				JOptionPane.showMessageDialog(null, "Deleted");
				this.setVisible(false);
				TimeUnit.MILLISECONDS.sleep(1000);
				this.setVisible(true);
			} catch (Exception error) {
				JOptionPane.showMessageDialog(null, error.getMessage());
			}
		}
		
	}

	public void mouseClicked(java.awt.event.MouseEvent e0) {
		
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
		
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		
	}

}
