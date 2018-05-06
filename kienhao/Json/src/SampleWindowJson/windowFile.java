package SampleWindowJson;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class windowFile {
	
	private JFileChooser newsinstance() {
		JFileChooser choose = new JFileChooser();
		choose.setCurrentDirectory(new File("E:\\inputJson"));
		choose.setMultiSelectionEnabled(true);
		choose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("json File", "json");
		choose.setFileFilter(filter);
		return choose;
	}
	
	public File openFile() {
		JFileChooser choose = newsinstance();
		choose.setDialogTitle("Open File");
		if(choose.showOpenDialog(null)== JFileChooser.APPROVE_OPTION) {
			return choose.getSelectedFile();
		}
		return null;
	}
	
	public File saveFile() {
		JFileChooser choose = newsinstance();
		choose.setDialogTitle("Save File");
		if(choose.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
			return choose.getSelectedFile();
		}
		return null;
		
	}
}
