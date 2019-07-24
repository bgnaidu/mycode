package IOstreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
 
	public static void main(String[] args) {
	FileInputStream fis=null;
	
	try {
		fis=new FileInputStream(new File("C:/SampleJava/EmpData.txt"));
		System.out.println("file opened");
	 int i;
	 
	 while((i=fis.read()) !=-1) {
		 System.out.println((char)i);
		 
	 }
		
	} catch ( IOException e) {
		
		e.printStackTrace();
	}

	finally {
		try {
			fis.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	}

}
