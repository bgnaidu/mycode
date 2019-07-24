package IOstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderNDWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:/Users/gbevara/Desktop/5thbill.jpg");
		FileWriter fw=new FileWriter("C:/Users/gbevara/Desktop/newbill.jpg");
		
		int data1;
		while((data1=fr.read())!=-1){
			fw.write(data1);
		}
		
		
	}

}
