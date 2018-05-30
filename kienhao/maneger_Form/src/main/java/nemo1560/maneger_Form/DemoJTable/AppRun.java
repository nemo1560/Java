package nemo1560.maneger_Form.DemoJTable;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import nemo1560.maneger_Form.DemoJTable.GUI.registerFrame;

public class AppRun {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new registerFrame().setVisible(true);
			}
		});
	}
}
