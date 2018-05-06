package Write_Read_Misc_Object;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ReadMiscObjectFromFile {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		JFileChooser chooseFile = new JFileChooser();
		chooseFile.setDialogTitle("Open File");
		chooseFile.setCurrentDirectory(new File("E:\\inputJson"));
		chooseFile.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
		FileNameExtensionFilter filter = new  FileNameExtensionFilter("Json Type", "json");
		chooseFile.setFileFilter(filter);
		int result = chooseFile.showOpenDialog(null);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			String path = chooseFile.getSelectedFile().getPath();
			System.out.println(path);
			ObjectMapper objmap = new ObjectMapper();
			MetaListCustomer metalist = objmap.readValue(new File(path), MetaListCustomer.class);
			System.out.println(metalist);
		}
	}
	
}
