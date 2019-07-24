package com.cucumber.cucumber;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
//from j  a v  a 2 s. co m
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class Removetag {

	public static void main(String[] argv) throws Exception {
		
		String filepath="C:\\cucumber\\Test.xml";
		
		File file=new File(filepath);
	    InputSource is = new InputSource();
	    is.setCharacterStream(new StringReader(filepath));
	    
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    DocumentBuilder db = dbf.newDocumentBuilder();
	    
	    Document doc = db.parse(is);
	    Element element = (Element) doc.getElementsByTagName("Request").item(0);

	    Node parent = element.getParentNode();
	    parent.removeChild(element);
	    parent.normalize();
	    toString(doc);
	  }
	  private static void toString(Document newDoc) throws Exception{
	    DOMSource domSource = new DOMSource(newDoc);
	    Transformer transformer = TransformerFactory.newInstance().newTransformer();
	    StringWriter sw = new StringWriter();
	    StreamResult sr = new StreamResult(sw);
	    transformer.transform(domSource, sr);
	    System.out.println(sw.toString());  
	  }
//	  static String xmlRecords = 
//	      "<data>" +
//	      "  <employee>" +
//	      "    <name>Tom</name>"+ 
//	      "    <title>Manager</title>" +
//	      "  </employee>" +
//	      "  <employee>" +
//	      "    <name>Jerry</name>"+ 
//	      "    <title>Programmer</title>" +
//	      "  </employee>" +
//	      "</data>";
	}


