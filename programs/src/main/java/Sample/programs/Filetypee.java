package Sample.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.xml.sax.SAXException;

public class Filetypee {
	 private static Pattern fileExtnPtrn= Pattern.compile("([^\\s]+(\\.(?i)(txt|xml|csv|pdf))$)");
	   
	 public static boolean validateFileExtn(String filename){
		 Matcher match = fileExtnPtrn.matcher(filename);
		 if (match.matches()) {
			 return true;
		 }
		 
		return false;
		 
	 }
	 
	 public void validation() throws FileNotFoundException, SAXException, IOException {
		 if (validateFileExtn("C:/cucumber/Source.xml")) {
		 XMLComparator.main(null);
	 }
		 else {
			 System.out.println("no methods are available");
		 }}
	
	 
	 public static void main(String[] args) throws FileNotFoundException, SAXException, IOException {
		 Filetypee filetypee=new Filetypee();
		 filetypee.validation();
		/*System.out.println("Is 'java2novice.pdf' allowed file? "
				+validateFileExtn("java2novice.pdf"));
		System.out.println("Is 'cric.doc' allowed file? "
				+validateFileExtn("cric.doc"));
				System.out.println("Is 'java.gif' allowed file? "
				+validateFileExtn("java.gif"));
			System.out.println("Is 'novice.mp3' allowed file? "
			+validateFileExtn("novice.mp3"));
				System.out.println("Is 'java_2.jpeg' allowed file? "
			+validateFileExtn("java_2.jpeg"));
	}*/
	 }
}