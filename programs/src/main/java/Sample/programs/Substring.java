package Sample.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Substring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("C:/cucumber/Test.xml");
String str = FileUtils.readFileToString(file, "UTF-8");
int point =(str.indexOf("<config>")+"<config>".length());
int endpoint =(str.indexOf("</config>"));

String modifieddata = str.substring(point , endpoint-1);

System.out.println(modifieddata);
File myFile = new File("C:/cucumber/MyTestFile.xml");
 FileUtils.writeStringToFile(myFile, modifieddata);

	}

}
