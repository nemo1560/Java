package nemo1560.Calculator;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import nemo1560.Calculator.GUI.mainFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       SwingUtilities.invokeLater(new Runnable() {
		
		public void run() {
			new mainFrame().setVisible(true);
			
		}
	});
    }
}
