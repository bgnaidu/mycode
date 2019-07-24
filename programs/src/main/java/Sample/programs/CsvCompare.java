package Sample.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;



public class CsvCompare {
@SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException {
	
	
	String[][] cols={};
	String[][] cols1={};
	int row=0;
	int row1=0;
	int j=0;
	/*Scanners=newScanner(newFile("WatfordUpdateFile.csv"));
	Scannerc=newScanner(newFile("udc.csv"));
	while(s.hasNextLine()){
	Stringline=s.nextLine();
	cols=line.split(",");
	System.out.println(cols[0]);*/
	Scanner s=new Scanner(new File("C:\\csv\\file1.csv"));
	Scanner w=new Scanner(new File("C:\\csv\\file2.csv"));
	while(w.hasNextLine())
	{
	String line1=w.nextLine();
	System.out.println(cols);
	//cols[row]=line1.split(",");
	row++;
	if(!w.hasNextLine()){
	while(s.hasNextLine()){
	String line2=s.nextLine();
	//cols1[row1]=line2.split(",");
	//putwhileloopindiffrentmethodbutbreak
	if(cols[j].equals(cols1[row1]))
	{
	j++;
	row1++;
	System.out.print(cols[j]);
	System.out.print("");
	System.out.print(cols1[row1]);
	System.out.println();
	}else{
	row1++;
	}
	}
	}
	}
	} 

}
