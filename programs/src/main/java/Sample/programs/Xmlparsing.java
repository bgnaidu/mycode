package Sample.programs;


	import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.xpath.XPath;
	import javax.xml.xpath.XPathConstants;
	import javax.xml.xpath.XPathFactory;

	import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

	public class Xmlparsing {

		 public static void main(String[] args) {
			  try{
//			  BufferedReader bf = new BufferedReader(
//			   new InputStreamReader(System.in));
//			  System.out.print("Enter xml file name: ");
//			  String str = bf.readLine();
			  File file=new File("C:\\cucumber\\Test.xml");
			  if (file.exists()){
			  DocumentBuilderFactory fact = 
			   DocumentBuilderFactory.newInstance();
			  DocumentBuilder builder = fact.newDocumentBuilder();
			  Document doc = builder.parse(file);
			  Node node = doc.getDocumentElement();
			  String root = node.getNodeName();
			  String rootelemnt=root.toUpperCase();
			  System.out.println("Root Node: " + rootelemnt);
			  
			  }
			  else{
			  System.out.println("File not found!");
			  }
			  }
			  catch(Exception e){}
			  }

	}

