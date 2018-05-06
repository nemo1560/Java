
package Demo_Json.write_object_to_json;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ReadJsonToObject {
	
	public static void main(String[] args) {
		//Khai bao doi jackson json
		ObjectMapper objMapper = new ObjectMapper();
		
		//show window de doc file
		JFileChooser chooseFile = new JFileChooser();
		chooseFile.setDialogTitle("Show File");
		chooseFile.setCurrentDirectory(new File("E:\\NetBeansProjects\\inputJson"));
		chooseFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		String[] arrExtension = new String[] {"json","xml"};
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database Only", arrExtension);
		chooseFile.setFileFilter(filter);
		
		int result = chooseFile.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
 			String strPath = chooseFile.getSelectedFile().getPath();
 			
 			try {
				Customer outputCustomer = objMapper.readValue(new File(strPath), Customer.class);
				//write to client;
				System.out.println(outputCustomer);
				
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
