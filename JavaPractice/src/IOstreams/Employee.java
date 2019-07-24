package IOstreams;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String Name;
	double salary;
	transient int ssn;
	
	public Employee(int id, String Name, Double salary, int ssn) {
		this.id=id;
		this.Name=Name;
		this.salary=salary;
		this.ssn=ssn;
	}
}
