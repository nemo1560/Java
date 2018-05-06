package Write_Read_Misc_Object;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Demo_Json.write_object_to_json.Customer;

public class WriteMiscObjectToFile {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Tao ra n object customer de dua vao mang arrCus
		Customer cus = new Customer("Hao", 1988, 1000);
		Customer cus2 = new Customer("Meo", 1999, 10000);
		Customer cus3 = new Customer("Lun", 1990, 5000);
		
		ArrayList<Customer> lstCus = new ArrayList<>();
		lstCus.add(cus);
		lstCus.add(cus2);
		lstCus.add(cus3);
		//Dua vao mang.
		MetaListCustomer arrCus = new MetaListCustomer();
		arrCus.setReturnCode(0);
		arrCus.setErrorMessage("");
		arrCus.setTotalRecode(lstCus.size());
		arrCus.setArrCus(lstCus);
		
		//thuc hien cua so de write xuong

		//tao noi dung cua hop thoai
				JFileChooser chooseFile = new  JFileChooser();
				chooseFile.setDialogTitle("Save as"); // title window
				chooseFile.setCurrentDirectory(new File("E:\\inputJson")); // lay path den folder chua data.
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
				
				//neu tra ra ok thi se mo hop thoai
				if(result == chooseFile.APPROVE_OPTION) {
					//Lay path toi forlder
					String strPath = chooseFile.getSelectedFile().getPath();
					//write to file(vd: customer.json)
					try {
						objMapper.writeValue(new File(strPath), arrCus);//instance lai cai duong dan file, object.
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
