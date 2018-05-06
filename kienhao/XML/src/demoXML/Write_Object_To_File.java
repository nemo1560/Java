package demoXML;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Write_Object_To_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = PathFileLib.SaveFile();
			System.out.println(file.getPath());
			if(!file.equals(null)) {
				String strfile = file.getAbsolutePath();
				
				//2. tao ra 1 mang chua cac doi tuong customer
				
				CustomerMetaData customerMetaData = new CustomerMetaData();
				List<Customer>arrData = new ArrayList<>();
				
				Customer c1 = new Customer(1, "a", 10000);
				Customer c2 = new Customer(2, "b", 20000);
				Customer c3 = new Customer(3, "c", 40000);
				Customer c4 = new Customer(4, "d", 50000);
				Customer c5 = new Customer(5, "e", 90000);
				Customer c6 = new Customer(6, "f", 110000);
				Customer c7 = new Customer(7, "g", 80000);
				
				arrData.add(c1);
				arrData.add(c2);
				arrData.add(c3);
				arrData.add(c4);
				arrData.add(c5);
				arrData.add(c6);
				arrData.add(c7);
				
				customerMetaData.setArrcus(arrData);
				customerMetaData.setStrPath(strfile);
				writeObjectToXML(customerMetaData);
				
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
	
	public static void writeObjectToXML(CustomerMetaData arrMetaData) {
		try {
			DocumentBuilder docbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			// tao ra document "empty"
			Document doc = docbuilder.newDocument(); 
			
			//tao ra rootNode.
			Element rootnode = doc.createElement("customers");
			
			//dua vao file xml.
			doc.appendChild(rootnode);
			
			//tao ra cac element child.
			for (Customer element : arrMetaData.getArrcus()) {
				
				Element customer = doc.createElement("customer");
				rootnode.appendChild(customer);
				
				//tao ra element con
				Element custid = doc.createElement("custid");
				//dua gia tri vao node custid
				custid.appendChild(doc.createTextNode(String.valueOf(element.getCustid())));
				//add custid vao element customer.
				customer.appendChild(custid);
				
				//tao ra element con
				Element custname = doc.createElement("custname");
				//dua gia tri vao node custid			custname.appendChild(doc.createTextNode(element.getCustname()));
				//add custid vao element customer.
				customer.appendChild(custname);
				
				//tao ra element con
				Element salary = doc.createElement("salary");
				//dua gia tri vao node custid
				salary.appendChild(doc.createTextNode(String.valueOf(element.getSalary())));
				//add custid vao element customer.
				customer.appendChild(salary);
			}
			
			//Thuc hien write du lieu xuong file
			
			Transformer tranformer = TransformerFactory.newInstance().newTransformer();
			DOMSource domsource = new DOMSource(doc);
			
			StreamResult result = new StreamResult(arrMetaData.getStrPath());
			tranformer.transform(domsource, result);
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("not OK");
		}
	}

}
