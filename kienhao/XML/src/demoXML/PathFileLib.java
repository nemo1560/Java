package demoXML;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class PathFileLib {
	/* @ Desripcition: thu vien cho phep mo cua so de luu hoac mo file. 
	 * @ Result: co cac phuong thuc return duong duong dan toi file.
	 * */
	
	private static JFileChooser newInstance() {
		JFileChooser filechoose = new JFileChooser();
		filechoose.setDialogTitle("Open File");
		filechoose.setCurrentDirectory(new File("."));
		filechoose.setMultiSelectionEnabled(true);
		filechoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Json Type", "json","xml");
		filechoose.setFileFilter(filter);
		
		return filechoose;
	}
	// lay File object do can lay duong dan file
	public static File OpenFile() {
		JFileChooser choose = newInstance();
		int result = choose.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			return choose.getSelectedFile();
		}
		return null;
	}
	
	public static File SaveFile() {
		JFileChooser choose = newInstance();
		int result = choose.showSaveDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			return choose.getSelectedFile();
		}
		return null;
	}
	
}
