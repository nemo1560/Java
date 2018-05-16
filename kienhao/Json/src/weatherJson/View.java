package weatherJson;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
	private JPanel GUI,north_panel,center_panel,south_panel;
	
	public View() {
		this.setTitle("Weather");
		this.setSize(300, 300);
		this.setLocation(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(gui());
	}
	
	public JPanel gui() {
		GUI = new JPanel(new BorderLayout());
		
		return GUI;
	}
	
	

}
