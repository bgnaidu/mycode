package IOstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos;
//		ObjectOutputStream oos;
//		
//		try {
//			fos=new FileOutputStream("C:/SampleJava/synchronizedemo.ser");
//			oos=new ObjectOutputStream(fos);
//			
//			Employee employee=new Employee(3431, "Gowrunaidu",  2500000d, 12345);
//			oos.writeObject(employee);
//			
//		System.out.println("object writes the data");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// deserilization Demo
		
		FileInputStream fileInputStream=new FileInputStream("C:/SampleJava/synchronizedemo.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Object object=inputStream.readObject();
		Employee employee=(Employee) object;
		System.out.println(employee.id);
		System.out.println(employee.Name);
		System.out.println(employee.salary);
		System.out.println(employee.ssn);
		
		
		

	}

}
