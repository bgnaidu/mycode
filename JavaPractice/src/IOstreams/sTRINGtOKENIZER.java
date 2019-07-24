package IOstreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sTRINGtOKENIZER {

	public static void main(String[] args) throws IOException {
		String s="you/are/the/creater/of/your/own/destiny";
 StringTokenizer st=new StringTokenizer(s, "/", false);
 
 while(
 st.hasMoreTokens()) {
	 System.out.println(st.nextToken());
 }
 
 FileReader fr = null;
 BufferedReader br=null;
try {
	fr = new FileReader("C:/SampleJava/EmpData.txt");
	  br=new BufferedReader(fr);
	 String line;
	 int count=0;
	 while((line=br.readLine())!=null){
		 
		 StringTokenizer st1=new StringTokenizer(line);
		 while(st1.hasMoreTokens()) {
			 System.out.println(st1.nextToken());
			 count++;
		 }
		 System.out.println("total count is"+count);
		
	 }
	
	
	 
} 

catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	fr.close();
	
	br.close();
	
}

 
 
 
	}

}
