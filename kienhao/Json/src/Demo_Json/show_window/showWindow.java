package Demo_Json.show_window;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class showWindow {
	
	public static void main(String[] args) {
		JFileChooser chooseFile = new  JFileChooser();
		chooseFile.setDialogTitle("Save as"); // title window
		chooseFile.setCurrentDirectory(new File("E:\\NetBeansProjects\\inputJson")); // lay path den folder chua data.
		chooseFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); //chua cac tuy chon cua JFileChooser de chon hien thi duoi file
		
		//Tao mang cac duoi file de hien thi
		String[] arrExtension = new String[] {"json","xml"};
		
		//dua vao bo loc
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database Only", arrExtension); //(mo ta trong type file khi mo hop thoai, mang duoi file can thiet)
		
		//dua cai file filter da loc vao chooseFile.setFileFilter
		chooseFile.setFileFilter(filter);
		
		//Yeu cau mo hop thoai(GUI)
		int result = chooseFile.showSaveDialog(null);
		//neu tra ra ok thi se mo hop thoai
		if(result == chooseFile.APPROVE_OPTION) {
			//Lay path toi forlder
			File strFile = chooseFile.getSelectedFile(); // lay ten file
			String strPath = strFile.getAbsolutePath(); // lay duong dan cua setcurrentDirectory
			System.out.println(strPath);
		}
		
	}

}
