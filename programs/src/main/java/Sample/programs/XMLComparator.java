package Sample.programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.apache.log4j.Logger;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.Difference;
import org.custommonkey.xmlunit.XMLUnit;
import org.xml.sax.SAXException;

/**
  *
  * Java program to compare two XML files using XMLUnit example

  * @author Javin Paul
  */
public class XMLComparator {
 
 final static Logger LOGGER=Logger.getLogger(XMLComparator.class);
    public static void main(String args[]) throws FileNotFoundException, 
                                                  SAXException, IOException {
     
        // reading two xml file to compare in Java program
        FileInputStream fis1 = new FileInputStream("C:/cucumber/Source.xml");
        FileInputStream fis2 = new FileInputStream("C:/cucumber/Target.xml");
     
        // using BufferedReader for improved performance
        BufferedReader  source = new BufferedReader(new InputStreamReader(fis1));
        BufferedReader  target = new BufferedReader(new InputStreamReader(fis2));
     
        //configuring XMLUnit to ignore white spaces
        XMLUnit.setIgnoreWhitespace(true);
     
        //comparing two XML using XMLUnit in Java
        List differences = compareXML(source, target);
     
        //showing differences found in two xml files
       try{
    	   
     
        printDifferences(differences);
        
       }
       catch (ClassCastException e) {
    	   LOGGER.error(e);
		// TODO: handle exception
	}
   
    }    
 
    public static List compareXML(Reader source, Reader target) throws
                  SAXException, IOException{
     
        //creating Diff instance to compare two XML files
        Diff xmlDiff = new Diff(source, target);
     
        //for getting detailed differences between two xml files
        DetailedDiff detailXmlDiff = new DetailedDiff(xmlDiff);
     
        return detailXmlDiff.getAllDifferences();
    }
 
    public static void printDifferences(List<String> differences){
        int totalDifferences = differences.size();
        LOGGER.debug(differences);
        System.out.println(differences);
        System.out.println("===============================");
        System.out.println("Total differences : " + totalDifferences);
        System.out.println("================================");
     
        for(String difference : differences){
            System.out.println(difference);
            LOGGER.debug(difference);
        }
    }
}