package IOstreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreams {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		FileOutputStream fos =null;
		
		try {
			fis=new FileInputStream(new File("C:/Users/gbevara/Desktop/5thbill.jpg"));
			fos=new FileOutputStream(new File("C:/Users/gbevara/Desktop/newbill.jpg"));
			int data;
			
//			while((data=fis.read())!=-1) {
//				fos.write(data);
//			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
