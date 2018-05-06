package Demo_Json.write_object_to_json;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class WriteObjectToJson {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//tao noi dung cua hop thoai
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
		
		// tao object trong thu vien jackson de goi ham write xuong file
		ObjectMapper objMapper = new ObjectMapper();
		
		//tao object Customer ==> write to json
		Customer cus = new Customer("Hao", 1989, 1000d);
		
		//neu tra ra ok thi se mo hop thoai
		if(result == chooseFile.APPROVE_OPTION) {
			//Lay path toi forlder
			String strPath = chooseFile.getSelectedFile().getPath();
			//write to file(vd: customer.json)
			try {
				objMapper.writeValue(new File(strPath), cus);//instance lai cai duong dan file, object.
				JOptionPane.showMessageDialog(null, "Da luu thanh cong");
				
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
			System.out.println(strPath);
		}
		
	}
}
