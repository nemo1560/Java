package demoXML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Read_File_XML {
	
	/*
	 * Desc: Doc du lieu tu file XML co cau truc cho truoc
	 * */
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//1. Mo cua so de doc file
		File pathfile = PathFileLib.OpenFile();
		String file;
		if(pathfile!=null) {
			file = pathfile.getPath();
			//2. Goi toi thu vien cua Java
			DocumentBuilder docbuider = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = docbuider.parse(new File(file));
			//3. Tien hanh parse tu doc (da chua noi dng xml
			NodeList root = doc.getElementsByTagName("customer");
			//4.Doc tung thanh phan trong element Tagname.
			for(int i=0;i<root.getLength();i++) {
				Element e = (Element) root.item(i);
				System.out.println(e.getElementsByTagName("custid").item(0).getTextContent());
				System.out.println(e.getElementsByTagName("custname").item(0).getTextContent());
			}
			
		}
		else {
			System.out.println("Canceled");
		}
	}

}
